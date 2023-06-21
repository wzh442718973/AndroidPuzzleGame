package com.luminous.luminescent.celebrity;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;





 
@RunWith(AndroidJUnit4.class)
public class SOGrid {
float manifestHome_max = 0.0f;
private HashMap<String,Double> buildMainModeMap;
ArrayList<Double> playerGameFrame_95List;



    @Test
    public void useAppContext() throws Exception {
        
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.luminous.luminescent.celebrity", appContext.getPackageName());
    }
}
