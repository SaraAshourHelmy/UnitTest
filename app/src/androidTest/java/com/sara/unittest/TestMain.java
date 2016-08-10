package com.sara.unittest;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by Bassem on 8/10/2016.
 */
public class TestMain extends ActivityInstrumentationTestCase2<MainActivity> {

    Solo solo;


    public TestMain() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();

    }

    public void test() throws Exception {


        solo.assertCurrentActivity("current", MainActivity.class);
        solo.enterText(0, "soso");
        solo.clickOnButton("Test");
        solo.clearEditText(0);
        solo.enterText(0, "sara");
        solo.clickOnButton("Test");
        solo.waitForText(solo.getString(R.id.tv_hello), 1, 3000);
        // solo.assertCurrentActivity("current", SecondActivity.class);


        // solo.getEditText(R.id.tv_test);

    }
}
