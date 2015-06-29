package portfolio.nanodegree.android.ntippa.portfolio;

import android.view.View;
import android.widget.Toast;



/**
 * Created by Nalini on 6/25/2015.
 */
public class ButtonClickListener implements View.OnClickListener {

    String message;
    public ButtonClickListener(String msg){
        message = msg;

    }

    @Override
    public void onClick(View view){
     // displayMessage(message);
    }
}
