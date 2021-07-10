package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


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

 @FXML
 ImageView displaySign;
 Image ograniczenie30 = new Image(getClass().getResourceAsStream("ograniczenie30.jpg"));
 Image ograniczenie50 = new Image(getClass().getResourceAsStream("ograniczenie50.jpg"));
 Image ograniczenie90 = new Image(getClass().getResourceAsStream("ograniczenie120.jpg"));
 Image pierszenstwo = new Image(getClass().getResourceAsStream("pierszenstwo.jpg"));
 Image stop = new Image(getClass().getResourceAsStream("stop.jpg"));


 public void sign1act()
 {
  displaySign.setImage(ograniczenie30);
 }
 public void sign2act()
 {
  displaySign.setImage(ograniczenie50);
 }
 public void sign3act()
 {
  displaySign.setImage(ograniczenie90);
 }
 public void sign4act()
 {
  displaySign.setImage(pierszenstwo);
 }
 public void sign5act()
 {
  displaySign.setImage(stop);
 }



 /*public void CheckClick() throws InterruptedException {
  samochod.looseSpeed();
 }*/

 @FXML
 Label label_result;

 car samochod = new car();

}
