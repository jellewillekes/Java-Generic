/*******************************************************************************
  * File: ServerSimulation.java
  * Author: Andre Berger  
  *
  * API for HW-17
  ****************************************************************************/

public class ServerSimulation{
  
  private final int numberOfServers;
  private final int numberOfTimePeriods;
  private final int numberOfTasks;
  private final int durationPerTask;
  
  private int finalQueueLength;
  private int totalQueueLength;
  private int totalWaitTime;
  private int totalNumberOfTasks;
  
  public ServerSimulation(int numberS, int time, int numberT, int duration){
    
    this.numberOfServers = numberS;
    this.numberOfTimePeriods = time;
    this.numberOfTasks = numberT;
    this.durationPerTask = duration;
    
    this.finalQueueLength = 0;;
    this.totalQueueLength = 0;
    this.totalWaitTime = 0;
    this.totalNumberOfTasks = 0;
  }
  
// returns the average wait time for tasks that are processed
  public double getWaitTime(){
    return ((this.totalWaitTime*1.0)/this.totalNumberOfTasks);
  }
  
  // returns the average queue length over the time period
  public double getQueueLength(){  
    return ((1.0*this.totalQueueLength)/this.numberOfTimePeriods);
  }
  
  // returns the queue length after time this.numberOfTimePeriods
  public int getFinalQueueLength(){
    return this.finalQueueLength;
  }
  
  
  // runs the simulation as described in the homework exercise
  public void run(){
    int[] servers = new int[this.numberOfServers]; // this array will store the time when a Task will be finished in each of the M servers
    for(int i=0; i<this.numberOfServers; i++){
      servers[i]=0;
    }
    Queue<Task> waitingQueue = new Queue<Task>();
    for(int i = 1 ; i<=this.numberOfTimePeriods ; i++){
      
      int k = (int)(Math.random()*(this.numberOfTasks+1));
      totalNumberOfTasks = totalNumberOfTasks + k;
      for(int j = 0 ; j<k ; j++){
        int d = (int)(Math.random()*this.durationPerTask)+1;
        Task taskJ = new Task(i,d);
        waitingQueue.enqueue(taskJ);
      }
      for(int p=0; p<this.numberOfServers;p++){
                  if (servers[p] == i){
          servers[p]=0;
      }
                  if(waitingQueue.isEmpty()==false){
                  if(servers[p]==0){
            Task taskI = waitingQueue.dequeue();
            servers[p]= i + taskI.getDuration();
            totalWaitTime= totalWaitTime+(i- taskI.getArrival());
          }
        }

    }
      totalQueueLength = totalQueueLength + waitingQueue.size();

    }
    finalQueueLength= waitingQueue.size();
  }

  
  
  
  
  
  // test the simulation usind command line parameters
  public static void main (String[] args){
    
    int M  = Integer.parseInt(args[0]); //Number of server
    int T  = Integer.parseInt(args[1]); //Number of period
    int K  = Integer.parseInt(args[2]); //Number of tasks
    int D  = Integer.parseInt(args[3]); //Duration per task
    ServerSimulation simulation = new ServerSimulation(M, T, K, D);
    
    simulation.run();
    
    System.out.println("Average wait time per task: " + simulation.getWaitTime());
    System.out.println("Average queue length: " + simulation.getQueueLength()); 
    System.out.println("Queue length at end: " + simulation.getFinalQueueLength());
  }
}
