package And;
import static And.And.*;

public class train extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 4 ; i++){
			And.xLabels[0].setText(x[i][1] + "");
			xLabels[1].setText(x[i][2] + "");
			for(int j = 0 ; j < 3 ; j++){		
				y[i] += x[i][j] * w[j];
				
			}
			
			if(y[i] >= 0){
				y[i] = +1;
				output.setText(y[i] +"");
			}
			else{
				y[i] = -1;
				output.setText(y[i] +"");
			}
			//System.out.println("y" + i + " " + y[i]);
			for(int j = 0 ; j < 3 ; j++){
				if(d[i] != y[i])
				w[j] = w[j] + (d[i])*x[i][j];
			//	System.out.println("w" + j + " " + w[j]);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wLabels[j].setText(w[j]+"");;				
			}
			
		}
	}

}
