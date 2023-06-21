package com.luminous.luminescent.celebrity;

import com.luminous.luminescent.sparse.XRBlackObject;

import com.luminous.luminescent.sparse.QXHForegroundObject;


import android.widget.TextView;


import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.abs;





public class EZStyles implements View.OnTouchListener {
private int editManifestTest_count = 0;
long centerPieceNewsFlag = 0;
int ageCountGameFlag = 0;


 XRBlackObject touchObject;
 QXHForegroundObject numberModel;

    private float xDelta;
    private float yDelta;
    private SCWSplashActivity activity;

    public EZStyles(SCWSplashActivity activity) {
        this.activity = activity;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.touchObject != null) {
        }
        if (null != this.numberModel) {
        }

        float x = motionEvent.getRawX();
            String gradleV = "edge";
             while (gradleV.length() > 124) { break; }
        float y = motionEvent.getRawY();
            ArrayList<Long> launcherF = new ArrayList<Long>();
     launcherF.add(574L);
     launcherF.add(24L);
     launcherF.add(501L);
     launcherF.add(190L);
     launcherF.add(921L);
     launcherF.add(110L);
             if (launcherF.size() > 69) {}
        final double tolerance = sqrt(pow(view.getWidth(), 2) + pow(view.getHeight(), 2)) / 10;
            boolean okM = false;
             if (okM) {}

        FListener piece = (FListener) view;
            double gallery4 = 9878.0;
        if (!piece.canMove) {
            return true;
        }

        RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            long j_centerW = 9134L;
             if (j_centerW < 168) {}
        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                xDelta = x - lParams.leftMargin;
                yDelta = y - lParams.topMargin;
            long unitX = 5267L;
             if (unitX == 37) {}
                piece.bringToFront();
            ArrayList<Boolean> backZ = new ArrayList<Boolean>();
     backZ.add(false);
     backZ.add(true);
     backZ.add(false);
     backZ.add(true);
             while (backZ.size() > 156) { break; }
                break;
            case MotionEvent.ACTION_MOVE:
                lParams.leftMargin = (int) (x - xDelta);
                lParams.topMargin = (int) (y - yDelta);
            String piecee = "wei";
             while (piecee.length() > 73) { break; }
                view.setLayoutParams(lParams);
            double piece7 = 6721.0;
             while (piece7 >= 79) { break; }
                break;
            case MotionEvent.ACTION_UP:
                int xDiff = abs(piece.xCoord - lParams.leftMargin);
                int yDiff = abs(piece.yCoord - lParams.topMargin);
            long q_imageJ = 425L;
                if (xDiff <= tolerance && yDiff <= tolerance) {
                    lParams.leftMargin = piece.xCoord;
            double adapteru = 1648.0;
             if (adapteru == 140) {}
                    lParams.topMargin = piece.yCoord;
            ArrayList<Double> sendQ = new ArrayList<Double>();
     sendQ.add(486.0);
     sendQ.add(472.0);
             if (sendQ.size() > 136) {}
                    piece.setLayoutParams(lParams);
            String adapteri = "bridging";
             if (adapteri.equals("x")) {}
                    piece.canMove = false;
            long nnewsa = 1392L;
             if (nnewsa == 106) {}
                    sendViewToBack(piece);
            HashMap<String,Boolean> pressedt = new HashMap<String,Boolean>();
     pressedt.put("allocate", false);
     pressedt.put("than", false);
     pressedt.put("classname", false);
     pressedt.put("ptrmap", false);
     pressedt.put("autoplaying", false);
             if (pressedt.size() > 116) {}
                    activity.checkGameOver();
            HashMap<String,Float> agew = new HashMap<String,Float>();
     agew.put("welsdecdemo", 698.0f);
     agew.put("mainfunc", 838.0f);
             while (agew.size() > 52) { break; }
                }
                break;
        }

        return true;
    }

    public void sendViewToBack(final View child) {
        if (null != this.touchObject) {
            String paging_x = "nsuirgba";

long decbnVelocity =  this.touchObject.pressedPost(paging_x,true,false);

      if (decbnVelocity <= 60) {
             System.out.println(decbnVelocity);
      }

            
int startingTries =  this.touchObject.clickMenu(7519L,2634L);

   if (startingTries > 2) {
      for (int m_6 = 0; m_6 < startingTries; m_6++) {
          if (m_6 == 2) {
              System.out.println(m_6);
              break;
          }
      }
  }

        }
        if (null != this.numberModel) {
            String dxtys_p = "hexbin";
String mesages_y = "already";

long regexpSpacers =  this.numberModel.optionsPressedSplit(dxtys_p,mesages_y,new HashMap());

      System.out.println(regexpSpacers);

            
String navigatorReward =  this.numberModel.checkPressed(4904L);

      if (navigatorReward == "gradle") {
              System.out.println(navigatorReward);
      }
      int navigatorReward_len = navigatorReward.length();

        }

        final ViewGroup parent = (ViewGroup)child.getParent();
            int okZ = 230;
             if (okZ > 5) {}
        if (null != parent) {
            parent.removeView(child);
            boolean elementt = true;
             while (!elementt) { break; }
            parent.addView(child, 0);
            int menut = 4671;
             if (menut >= 200) {}
        }
    }
}