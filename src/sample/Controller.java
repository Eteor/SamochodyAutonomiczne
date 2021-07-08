package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

 public void AcceleratorAction(){
  samochod.accelerate();
  System.out.println(samochod.currentSpeed);
  label_result.setText(Integer.toString(samochod.currentSpeed));
 }

 public void BreakingAction(){
  samochod.breaking();
  System.out.println(samochod.currentSpeed);
  label_result.setText(Integer.toString(samochod.currentSpeed));
 }

 /*public void CheckClick() throws InterruptedException {
  samochod.looseSpeed();
 }*/

 @FXML
 Label label_result;

 car samochod = new car();

}
