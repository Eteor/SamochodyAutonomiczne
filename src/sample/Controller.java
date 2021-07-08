package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

 public void AcceleratorAction(){
  samochod.accelerate();
  System.out.println(samochod.currentSpeed);
 }

 public void BreakingAction(){
  samochod.breaking();
  System.out.println(samochod.currentSpeed);

 }

 car samochod = new car();


}
