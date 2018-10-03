/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartphonedriver;
import java.util.*;

/**
 *
 * @author glSon8840
 */
public class SmartPhone {
    int numApps;
    ArrayList<String> appList;
    String typeOfPhone;

  public SmartPhone() {
    appList = new ArrayList<String>();
    numApps = 0;

    //No phone type was sent - pick random
    int randType = (int)(Math.random() * 3 + 1);
    if(randType == 1){
      typeOfPhone = "iPhone";
    }
    else if(randType == 2) {
      typeOfPhone = "Android";
    }
    else {
      typeOfPhone = "Blackberry";
    }
  }

  public SmartPhone(String smrtPhnType) {
    appList = new ArrayList<String>();
    numApps = 0;
    typeOfPhone = smrtPhnType;
  }

  public void addApp(String appName){
    appList.add(appName);
    numApps++;
  }

  public void removeApp(int location){
    appList.remove(location);
    numApps--;
  }

  public String toString() {
    String output = "The following apps are installed on your "
      +typeOfPhone+":\n";
    for(int i = 0; i < numApps; i++){
      output += "App #" + i + " - " + appList.get(i) + "\n";
    }
    return output;
}
}
