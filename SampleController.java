package application;

import java.math.BigDecimal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

class Item{
	final static int ADD=1;
	final static int SUB=2;
	final static int MUL=3;
	final static int DIV=4;

	int cal;
	BigDecimal num;

}
public class SampleController {
@FXML Button button1;
@FXML Button button2;
@FXML Button button3;
@FXML Button button4;
@FXML Button button5;
@FXML Button button6;
@FXML Button button7;
@FXML Button button8;
@FXML Button button9;
@FXML Button button0;
@FXML Button buttonC;
@FXML Button buttonDot;//小数点
@FXML Button buttonAdd; //足し
@FXML Button buttonSub; //引き
@FXML Button buttonMul; //掛け
@FXML Button buttonDiv; //割り
@FXML Button buttonEql; //イコール
@FXML TextField text; //文字列

Item[] item=new Item[2];
int now=1;
boolean next=false;

public SampleController() {
	item[0]=new Item();
	item[1]=new Item();
}

String str="";

@FXML
public void onClick(ActionEvent e) {
	 if(e.getSource().equals(button1)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="1";
}
	 else if(e.getSource().equals(button2)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="2";
}
	 else if(e.getSource().equals(button3)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="3";
}
	 else if(e.getSource().equals(button4)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="4";
}
	 else if(e.getSource().equals(button5)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="5";
}
	 else if(e.getSource().equals(button6)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="6";
}
	 else if(e.getSource().equals(button7)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="7";
}
	 else if(e.getSource().equals(button8)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="8";
}
	 else if(e.getSource().equals(button9)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="9";
}
	 else if(e.getSource().equals(button0)) {
		 if(next) {
			 str="";
			 text.setText(str);
			 now=2;
			 next=false;
		 }
		 str+="0";
}
	 else if(e.getSource().equals(buttonC)) {
		 str = "";
         item[0].num = BigDecimal.ZERO;
         item[1].num = BigDecimal.ZERO;
         now = 1;
         next = false;
}
	 else if(e.getSource().equals(buttonDot)) {
		 	str+=".";
}
	 else if(e.getSource().equals(buttonAdd)) {
		 if(now==1) {
			 try {
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.ADD;
			 next=true;
			 }
			 catch(NumberFormatException er) {
		 }
		 }
		 else if(now==2) {
			 item[1].num=new BigDecimal(str);
			 switch(item[1].cal) {
			 case Item.ADD:
				 str=String.valueOf(item[0].num.add(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.SUB:
				 str=String.valueOf(item[0].num.subtract(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.MUL:
				 str=String.valueOf(item[0].num.multiply(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.DIV:
				 str=String.valueOf(item[0].num.divide(item[1].num,2,BigDecimal.ROUND_HALF_UP));
				 break;
			 }
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.ADD;
			 now=1;
			 next=true;
		 }
}
	 else if(e.getSource().equals(buttonSub)) {
		 if(now==1) {
		 try {
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.SUB;
			 next=true;
		 }
		 catch(NumberFormatException er) {
		 }
		 }
		 else if(now==2) {
			 item[1].num=new BigDecimal(str);
			 switch(item[1].cal) {
			 case Item.ADD:
				 str=String.valueOf(item[0].num.add(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.SUB:
				 str=String.valueOf(item[0].num.subtract(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.MUL:
				 str=String.valueOf(item[0].num.multiply(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.DIV:
				 str=String.valueOf(item[0].num.divide(item[1].num,2,BigDecimal.ROUND_HALF_UP));
				 break;
			 }
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.SUB;
			 now=1;
			 next=true;
		 }
}
	 else if(e.getSource().equals(buttonMul)) {
		 if(now==1) {
			 try {
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.MUL;
			 next=true;
			 }
				catch(NumberFormatException er) {
			 }
		 }
		 else if(now==2) {
			 item[1].num=new BigDecimal(str);
			 switch(item[1].cal) {
			 case Item.ADD:
				 str=String.valueOf(item[0].num.add(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.SUB:
				 str=String.valueOf(item[0].num.subtract(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.MUL:
				 str=String.valueOf(item[0].num.multiply(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.DIV:
				 str=String.valueOf(item[0].num.divide(item[1].num,2,BigDecimal.ROUND_HALF_UP));
				 break;
			 }
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.MUL;
			 now=1;
			 next=true;
		 }

}
	 else if(e.getSource().equals(buttonDiv)) {
		 if(now==1) {
			 try {
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.DIV;
			 next=true;
			 }
			 catch(NumberFormatException er) {
			 }
		 }
		 else if(now==2) {
			 item[1].num=new BigDecimal(str);
			 switch(item[1].cal) {
			 case Item.ADD:
				 str=String.valueOf(item[0].num.add(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.SUB:
				 str=String.valueOf(item[0].num.subtract(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.MUL:
				 str=String.valueOf(item[0].num.multiply(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
				 break;
			 case Item.DIV:
				 str=String.valueOf(item[0].num.divide(item[1].num,2,BigDecimal.ROUND_HALF_UP));
				 break;
			 }
			 item[0].num=new BigDecimal(str);
			 item[1].cal=Item.DIV;
			 now=1;
			 next=true;
		 }
}
	 if(e.getSource().equals(buttonEql)) {
	       if(now==2) {
	    	   item[1].num=new BigDecimal(str);
	    	   switch(item[1].cal) {
				 case Item.ADD:
					 str=String.valueOf(item[0].num.add(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
					 break;
				 case Item.SUB:
					 str=String.valueOf(item[0].num.subtract(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
					 break;
				 case Item.MUL:
					 str=String.valueOf(item[0].num.multiply(item[1].num).setScale(2,BigDecimal.ROUND_HALF_UP));
					 break;
				 case Item.DIV:
					 str=String.valueOf(item[0].num.divide(item[1].num,2,BigDecimal.ROUND_HALF_UP));
					 break;
				 }
				 item[0].num=new BigDecimal(str);
				 now=1;
				 next=true;
	       }
}
	 text.setText(str);

}
}