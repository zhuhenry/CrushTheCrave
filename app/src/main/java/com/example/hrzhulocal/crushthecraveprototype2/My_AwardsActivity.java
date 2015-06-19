package com.example.hrzhulocal.crushthecraveprototype2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.facebook.share.widget.ShareButton;

import java.util.Date;


public class My_AwardsActivity extends MainActivityHome {

    public static boolean SharedFB = false;
    public static boolean Feedback = false;
    public static boolean NightOut = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());

        setContentView(R.layout.activity_my__awards);

        final ImageButton ib33 = (ImageButton) findViewById(R.id.imageButton33);
        ImageButton ib34 = (ImageButton) findViewById(R.id.imageButton34);
        ImageButton ib35 = (ImageButton) findViewById(R.id.imageButton35);
        ImageButton ib36 = (ImageButton) findViewById(R.id.imageButton36);
        ImageButton ib37 = (ImageButton) findViewById(R.id.imageButton37);
        ImageButton ib38 = (ImageButton) findViewById(R.id.imageButton38);
        ImageButton ib39 = (ImageButton) findViewById(R.id.imageButton39);
        ImageButton ib40 = (ImageButton) findViewById(R.id.imageButton40);
        ImageButton ib41 = (ImageButton) findViewById(R.id.imageButton41);
        ImageButton ib42 = (ImageButton) findViewById(R.id.imageButton42);

        ImageButton ib43 = (ImageButton) findViewById(R.id.imageButton43);
        ImageButton ib44 = (ImageButton) findViewById(R.id.imageButton44);
        ImageButton ib45 = (ImageButton) findViewById(R.id.imageButton45);

        ImageButton ib46 = (ImageButton) findViewById(R.id.imageButton46);
        ImageButton ib47 = (ImageButton) findViewById(R.id.imageButton47);
        ImageButton ib48 = (ImageButton) findViewById(R.id.imageButton48);

        ImageButton ib49 = (ImageButton) findViewById(R.id.imageButton49);
        ImageButton ib50 = (ImageButton) findViewById(R.id.imageButton50);
        ImageButton ib51 = (ImageButton) findViewById(R.id.imageButton51);

        ImageButton ib52 = (ImageButton) findViewById(R.id.imageButton52);
        ImageButton ib53 = (ImageButton) findViewById(R.id.imageButton53);
        ImageButton ib54 = (ImageButton) findViewById(R.id.imageButton54);

        ImageButton ib55 = (ImageButton) findViewById(R.id.imageButton55);
        ImageButton ib56 = (ImageButton) findViewById(R.id.imageButton56);
        ImageButton ib57 = (ImageButton) findViewById(R.id.imageButton57);

        ImageButton ib58 = (ImageButton) findViewById(R.id.imageButton58);
        ImageButton ib59 = (ImageButton) findViewById(R.id.imageButton59);
        ImageButton ib60 = (ImageButton) findViewById(R.id.imageButton60);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.MyAwardInnerRL);
        rl.getLayoutParams().height = 500;

        // check for awards
        if (quitDayNum6 != -1) {
            //ib33.setVisibility(View.INVISIBLE);
            ib33.setImageResource(R.drawable.iconquitdate_sel);
        }

        if (smokeFreeDay >= 1) {
            ib34.setImageResource(R.drawable.iconday1_sel);
            ib35.setImageResource(R.drawable.rsz_icon_locked_half);
            ib36.setImageResource(R.drawable.rsz_icon_locked_half);
            ib37.setImageResource(R.drawable.rsz_icon_locked_half);
        }
        if (smokeFreeDay >= 7) {
            ib47.setImageResource(R.drawable.iconweek1_sel);
        }
        if (smokeFreeDay >= 21) {
            ib36.setImageResource(R.drawable.iconweek3_sel);
        }
        if (smokeFreeDay == 30) { //one month
            ib53.setImageResource(R.drawable.iconmouth1_sel);
        }
        if (theNumberOfCrave >= 100) {
            ib51.setImageResource(R.drawable.icon100cigarettes_sel);
        }
        if (theNumberOfCrave >= 250) {
            ib50.setImageResource(R.drawable.icon250cigarettes_sel);
        }
        if (theNumberOfCrave >= 500) {
            ib52.setImageResource(R.drawable.icon500cigarettes_sel);
        }
        //if(trak of smoking)()
        //if(track of craving){}
        if(moneySavedTotal >= 100){
            ib45.setImageResource(R.drawable.icon100_sel);
        }
        if(moneySavedTotal >= 500){
            ib35.setImageResource(R.drawable.icon500_sel);
        }
        if(moneySavedTotal >= 1000){
            ib55.setImageResource(R.drawable.icon1000_sel);
        }
        if((daysInBetween - daysInBetween2) >= 2){
            ib56.setImageResource(R.drawable.iconoxygen2_sel);
        }
        //changed to 40days instead
        if((daysInBetween - daysInBetween2) >= 40){
            ib49.setImageResource(R.drawable.iconoxygen_sel);
        }
        // 8 hours after quitting
        if((double)((daysInBetween - daysInBetween2)/24) >= (double)(8/24)){
            ib39.setImageResource(R.drawable.icono2_sel);
        }
        // changed to 60 days instead
        if ((daysInBetween2 - daysInBetween) >= 60) {
            ib37.setImageResource(R.drawable.iconbetterhealth_sel);
        }
        if((daysInBetween2 - daysInBetween) >= 14){
            ib43.setImageResource(R.drawable.iconnicotine_sel);
        }
        if((daysInBetween2 - daysInBetween) >= 2) {
            ib42.setImageResource(R.drawable.icontasteandsmell_sel);
            ib40.setImageResource(R.drawable.iconhappyheart_sel);
        }
        if((daysInBetween2 - daysInBetween) >= 80){
            ib57.setImageResource(R.drawable.iconheart2_sel);
        }
        //if((daysInBetween2 - daysInBetween) >=  ) refer to a friend XXXXib48
        if(SharedFB == true){
            ib58.setImageResource(R.drawable.iconshare_sel);
        }
        if(Feedback == true) {
            ib59.setImageResource(R.drawable.iconfeedback_sel);
        }
        if(NightOut == true){
            ib60.setImageResource(R.drawable.iconnightout_sel);
        }
        listenerCommitted();
        listenerQuitDate();
        listenerDay1();
        listenerWeek1();
        listenerWeek3();
        listenerMonth1();
        listener100Cig();
        listener250Cig();
        listener500Cig();
        listenerSmokingTracker();
        listenerCravingTracker();
        listener100Saved();
        listener500Saved();
        listener1000Saved();
        listenerBreatheEasier();
        listenerBreatheEasier2();
        listenerO2();
        listenerBetterHealth();
        listenerNicotineFree();
        listenerBetterTasteAndSmell();
        listenerHappyHeart();
        listenerHappyHeart2();
        listenerFriends();
        listenerSharing();
        listenerFeedback();
        listenerNightOut();
    }


    private void listenerCommitted() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton32);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Committed.class);
                startActivity(intent);
            }
        });
    }

    private void listenerQuitDate() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton33);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardQuitDate.class);
                startActivity(intent);
            }
        });
    }

    private void listenerDay1() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton34);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardDay1.class);
                startActivity(intent);
            }
        });
    }

    private void listenerWeek1() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton47);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardWeek1.class);
                startActivity(intent);
            }
        });
    }

    private void listenerWeek3() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton36);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardWeek3.class);
                startActivity(intent);
            }
        });
    }

    private void listenerMonth1() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton53);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardMonth1.class);
                startActivity(intent);
            }
        });
    }

    private void listener100Cig() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton51);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Award100Cig.class);
                startActivity(intent);
            }
        });
    }

    private void listener250Cig() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton50);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Award250Cig.class);
                startActivity(intent);
            }
        });
    }

    private void listener500Cig() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton52);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Award500Cig.class);
                startActivity(intent);
            }
        });
    }

    private void listenerSmokingTracker() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton41);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardSmokingTracker.class);
                startActivity(intent);
            }
        });
    }

    private void listenerCravingTracker() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton54);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardCravingTracker.class);
                startActivity(intent);
            }
        });
    }

    private void listener100Saved() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton45);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Award100Saved.class);
                startActivity(intent);
            }
        });
    }

    private void listener500Saved() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton35);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Award500Saved.class);
                startActivity(intent);
            }
        });
    }

    private void listener1000Saved() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton55);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Award1000Saved.class);
                startActivity(intent);
            }
        });
    }

    private void listenerBreatheEasier() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton56);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardBreatheEasier.class);
                startActivity(intent);
            }
        });
    }

    private void listenerBreatheEasier2() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton49);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardBreatheEasier2.class);
                startActivity(intent);
            }
        });
    }

    private void listenerO2() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton39);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardO2.class);
                startActivity(intent);
            }
        });
    }
    private void listenerBetterHealth() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton37);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardBetterHealth.class);
                startActivity(intent);
            }
        });
    }   private void listenerNicotineFree() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton43);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardNicotineFree.class);
                startActivity(intent);
            }
        });
    }   private void listenerBetterTasteAndSmell() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton42);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardBetterTasteAndSmell.class);
                startActivity(intent);
            }
        });
    }   private void listenerHappyHeart() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton40);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardHappyHeart.class);
                startActivity(intent);
            }
        });
    }private void listenerHappyHeart2() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton57);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardHappyHeart2.class);
                startActivity(intent);
            }
        });
    }private void listenerFriends() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton48);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardFriends.class);
                startActivity(intent);
            }
        });
    }private void listenerSharing() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton58);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardSharing.class);
                startActivity(intent);
            }
        });
    }private void listenerFeedback() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton59);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardFeedback.class);
                startActivity(intent);
            }
        });
    }private void listenerNightOut() {
        final Context context = this;
        imageButton = (ImageButton) findViewById(R.id.imageButton60);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AwardNightOut.class);
                startActivity(intent);
            }
        });
    }
}






