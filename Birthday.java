// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes

//To determine how many days are left till someone's birthday, we use the Julian Day Number Calculation.
class Birthday {  
  public static void main(String args[]){  
    int nowDay = java.time.LocalDate.now().getDayOfMonth();
    int nowMonth = java.time.LocalDate.now().getMonthValue();
    int nowYear = java.time.LocalDate.now().getYear();
    int birthDay = Integer.parseInt(args[0]); 
    int birthMonth = Integer.parseInt(args[1]); 
    int birthYear = Integer.parseInt(args[2]); 
//To determine the JDN we use the parameters a, y and m.
    int aNow = (14-nowMonth)/12;
    int aBirth = (14-birthMonth)/12;
    int yNow = nowYear + 4800 - aNow;
    int mNow = nowMonth + 12*aNow - 3;    
    int mBirth = birthMonth + 12*aBirth - 3; 
    
//If the Birthday has already passed this year, we use the following codes to determine the new parameter yBirthPass and jdnBirthPass.
//We add another year to nowYear to obtain the desired JDN for the next birthday. 
    int yBirthPass = nowYear+1 + 4800 - aBirth;
    int jdnBirthPass = birthDay + (153*mBirth + 2)/5 + 365*yBirthPass + yBirthPass/4 + yBirthPass/100 + yBirthPass/400 - 32045;
    
    int jdnNow = nowDay + (153*mNow + 2)/5 + 365*yNow + yNow/4 + yNow/100 + yNow/400 - 32045;
    int jdnNextBirth = birthDay + (153*mBirth + 2)/5 + 365*(yNow) + (yNow)/4 + (yNow)/100 + (yNow)/400 - 32045;
    
    if (birthDay == nowDay && birthMonth == nowMonth ){
      System.out.println("Congratulations, today is your birthday and you are " + (nowYear - birthYear) + " years old! "); 
    }
    else if( (birthMonth>=nowMonth) && (birthDay>nowDay)){
      System.out.println("In " + (jdnNextBirth-jdnNow) + " days you will be "+ (nowYear - birthYear) + " years old.");
    }
    else {
      System.out.println("In " + (jdnBirthPass-jdnNow) + " days you will be "+ (nowYear+1 - birthYear) + " years old.");
    }
  }
}