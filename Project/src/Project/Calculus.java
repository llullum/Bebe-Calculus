package Project;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.Date;
import java.util.concurrent.TimeUnit;

 
public class Calculus extends Application {
	double num=0;
	int score=0;
	Date time = null;
	//set the scene when the game is on and the générateur de proposition
	public Scene jeu(int n,Stage primaryStage,Number N)
	{
		Group root = new Group();
		Scene scene = new Scene(root,800,500);
		Text text = new Text((scene.getWidth()/2)-50, (scene.getHeight()/2)-50, N.get_nmax()+N.get_op()+N.get_nmin());
		text.setFill(Color.BLACK);
		text.setFont(new Font(50));
		int result = N.get_result();
		int bound = N.get_bound();
		
		//random 1
		int r1 = (int)(Math.random() * ( (result + bound) - (result - bound) ))+(result - bound);
		r1 = Math.abs(r1);
		while(r1 ==  result)
		{
			r1 = (int)(Math.random() * ( (result + bound) - (result - bound) ))+(result - bound);
			r1 = Math.abs(r1);
		}
		
		//button 1
		 Button b1 = new Button(r1+"");
		    b1.setLayoutX(scene.getWidth()/2-250);
		    b1.setLayoutY(scene.getHeight()/2+125);
		    b1.setFont(new Font(20));
		    b1.setStyle("-fx-background-color: Grey");
		    b1.setTextFill(Color.WHITE);
		    b1.setOpacity(1);
		    
		  //random 2
		    int r2 = (int)(Math.random() * ( (result + bound) - (result - bound) ))+(result - bound);
		    r2 = Math.abs(r2);
			while(r2 ==  result || r1 == r2)
			{
				r2 = (int)(Math.random() * ((result + bound) - (result - bound) ))+(result - bound);
				 r2 = Math.abs(r2);
			}
			
			//button 2
		    Button b2 = new Button(r2+"");
		    b2.setLayoutX(scene.getWidth()/2-125);
		    b2.setLayoutY(scene.getHeight()/2+125);
		    b2.setFont(new Font(20));
		    b2.setStyle("-fx-background-color: Grey");
		    b2.setTextFill(Color.WHITE);
		    b2.setOpacity(1);
		    
		  //random 3
		    int r3 = (int)(Math.random() * ( (result + bound) - (result - bound) ))+(result - bound);
		    r3 = Math.abs(r3);
			while(r3 ==  result|| r1 == r3|| r2 == r3)
			{
				r3 = (int)(Math.random() * (  (result + bound) - (result - bound) ))+(result - bound);
				 r3 = Math.abs(r3);
			}
			//button 3
		    Button b3 = new Button(r3+"");
		    b3.setLayoutX(scene.getWidth()/2+25);
		    b3.setLayoutY(scene.getHeight()/2+125);
		    b3.setFont(new Font(20));
		    b3.setStyle("-fx-background-color: Grey");
		    b3.setTextFill(Color.WHITE);
		    b3.setOpacity(1);
		    
		  //random tricky
		    int r4 = (int)(Math.random() * ( (result + 20)/10 - (result - 20)/10 ))+((result - 20)/10);
		    r4 = Math.abs(r4*10)+result%10;
		    while(r4 ==  result|| r1 == r4|| r2 == r4|| r3 == r4)
			{
				r4 = (int)(Math.random() * (  (result + bound) - (result - bound) ))+(result - bound);
				 r4 = Math.abs(r4);
			}
		    
		  //random 4
		    int r5 = (int)(Math.random() * ( (result + bound) - (result - bound) ))+(result - bound);
		    r5 = Math.abs(r5);
			while(r5 ==  result|| r1 == r5|| r2 == r5|| r3 == r5 || r4 == r5)
			{
				r5 = (int)(Math.random() * (  (result + bound) - (result - bound) ))+(result - bound);
				 r5 = Math.abs(r5);
			}
			
			//button 4
		    Button b4 = new Button(r5+"");
		    b4.setLayoutX(scene.getWidth()/2+175);
		    b4.setLayoutY(scene.getHeight()/2+125);
		    b4.setFont(new Font(20));
		    b4.setStyle("-fx-background-color: Grey");
		    b4.setTextFill(Color.WHITE);
		    b4.setOpacity(1);
		    
		    //when the answer is false you lose time
		    b1.setOnAction(e -> {
	    		try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		primaryStage.setScene(jeusolo(n,primaryStage,0));
	    		});
		    b2.setOnAction(e -> {;
	    		try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		primaryStage.setScene(jeusolo(n,primaryStage,0));
	    		});
		    b3.setOnAction(e -> {
	    		try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		primaryStage.setScene(jeusolo(n,primaryStage,0));
	    		});
		    b4.setOnAction(e -> {
	    		try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		primaryStage.setScene(jeusolo(n,primaryStage,0));
	    		});
		    
		    //set the tricky random to a button
		    int rs = (int)(Math.random() * ( 5 - 1 )) +1;
		    if(rs == 1)
		    {
		    	b1.setText( r4+"");
		    }
		    else if (rs == 2)
		    {
		    	b2.setText( r4+"");
		    }
		    else if (rs == 3)
		    {
		    	b3.setText(r4+"");
		    }
		    else 
		    {
		    	b4.setText(r4+"");
		    }
		    
		  //set the result to a button that is not the tricky one
		    int r = (int)(Math.random() * ( 5 - 1 )) +1;
		    while(r == rs)
		    {
		    	r = (int)(Math.random() * ( 5 - 1 )) +1;
		    }
		    if(r == 1)
		    {
		    	b1.setOnAction(e -> {
		    		primaryStage.setScene(jeusolo(n,primaryStage,1));
		    		});
		    	b1.setText( result+"");
		    }
		    else if (r == 2)
		    {
		    	b2.setOnAction(e -> {
		    		primaryStage.setScene(jeusolo(n,primaryStage,1));
		    		});
		    	b2.setText( result+"");
		    }
		    else if (r == 3)
		    {
		    	b3.setOnAction(e -> {
		    		primaryStage.setScene(jeusolo(n,primaryStage,1));
		    		});
		    	b3.setText(result+"");
		    }
		    else 
		    {
		    	b4.setOnAction(e -> {
		    		primaryStage.setScene(jeusolo(n,primaryStage,1));
		    		});
		    	b4.setText(result+"");
		    }
		    
		    
		scene.setFill(Color.CYAN);
		
	    root.getChildren().addAll(text,b1,b2,b3,b4);
	    return scene;
	}
	public Scene replay(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root,800,500);
		scene.setFill(Color.CYAN);
		Date now = new Date();
		long diff = now.getTime() - time.getTime();
		long sec = TimeUnit.MILLISECONDS.toSeconds(diff);
		long min = TimeUnit.MILLISECONDS.toMinutes(diff);
		Text text = new Text((scene.getWidth()/2)-200, 50, "You score "+ score+" in "+ min+" minutes and "+sec+" seconds.\n Replay ?");
		time = null;
		text.setLayoutX(-200);
		text.setFill(Color.BLACK);
		text.setFont(new Font(30));
		score = 0;
		num = 0;
		 Button beasy = new Button("easy");
		    beasy.setLayoutX(scene.getWidth()/2-175);
		    beasy.setLayoutY(scene.getHeight()/2+125);
		    beasy.setFont(new Font(20));
		    beasy.setStyle("-fx-background-color: Grey");
		    beasy.setTextFill(Color.WHITE);
		    beasy.setOpacity(1);
		    
		    Button bm = new Button("medium");
		    bm.setLayoutX(scene.getWidth()/2-50);
		    bm.setLayoutY(scene.getHeight()/2+125);
		    bm.setFont(new Font(20));
		    bm.setStyle("-fx-background-color: Grey");
		    bm.setTextFill(Color.WHITE);
		    bm.setOpacity(1);
		    
		    Button bd = new Button("hard");
		    bd.setLayoutX(scene.getWidth()/2+100);
		    bd.setLayoutY(scene.getHeight()/2+125);
		    bd.setFont(new Font(20));
		    bd.setStyle("-fx-background-color: Grey");
		    bd.setTextFill(Color.WHITE);
		    bd.setOpacity(1);
		    beasy.setOnAction(e -> primaryStage.setScene(jeusolo(0,primaryStage,0)));
		    bm.setOnAction(e -> primaryStage.setScene(jeusolo(1,primaryStage,0)));
		    bd.setOnAction(e -> primaryStage.setScene(jeusolo(2,primaryStage,0)));
		    root.getChildren().addAll(text,beasy,bm,bd);
		    return scene;
		
	}
	//start the game n= difficulty and s = the score that we did 
	public Scene jeusolo(int n,Stage primaryStage,int s)
	{
		num+=1;
		score +=s;
		if(time == null)
		{
			time = new Date();
		}
		//set all the random result and calcul
		Number N = new Number(n);
		if(num == 11)
		{
			return replay(primaryStage);
		}
		return jeu(n,primaryStage,N);
	}
	@Override
	public void start(Stage primaryStage) {
		//set the scene and the text
		Group root = new Group();
		Scene scene = new Scene(root,800,500);
		scene.setFill(Color.CYAN);
		Text text = new Text((scene.getWidth()/2)-200, 50, "Select the difficulty");
		text.setFill(Color.BLACK);
		text.setFont(new Font(50));
		//set all the buttons
	    Button beasy = new Button("easy");
	    beasy.setLayoutX(scene.getWidth()/2-175);
	    beasy.setLayoutY(scene.getHeight()/2+125);
	    beasy.setFont(new Font(20));
	    beasy.setStyle("-fx-background-color: Grey");
	    beasy.setTextFill(Color.WHITE);
	    beasy.setOpacity(1);
	    
	    Button bm = new Button("medium");
	    bm.setLayoutX(scene.getWidth()/2-50);
	    bm.setLayoutY(scene.getHeight()/2+125);
	    bm.setFont(new Font(20));
	    bm.setStyle("-fx-background-color: Grey");
	    bm.setTextFill(Color.WHITE);
	    bm.setOpacity(1);
	    
	    Button bd = new Button("hard");
	    bd.setLayoutX(scene.getWidth()/2+100);
	    bd.setLayoutY(scene.getHeight()/2+125);
	    bd.setFont(new Font(20));
	    bd.setStyle("-fx-background-color: Grey");
	    bd.setTextFill(Color.WHITE);
	    bd.setOpacity(1);
	    //set all the actions when pressing a button
	    beasy.setOnAction(e -> primaryStage.setScene(jeusolo(0,primaryStage,0)));
	    bm.setOnAction(e -> primaryStage.setScene(jeusolo(1,primaryStage,0)));
	    bd.setOnAction(e -> primaryStage.setScene(jeusolo(2,primaryStage,0)));
	    root.getChildren().addAll(text,beasy,bm,bd);
			primaryStage.setTitle("Bébé Calculus");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
 
			
		
	}
	
 
	public static void main(String[] args) {
		launch(args);
	}
}