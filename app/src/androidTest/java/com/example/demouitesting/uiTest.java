package com.example.demouitesting;

import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Intent;
import android.provider.Telephony;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class uiTest {
    @Rule
    public ActivityScenarioRule<MainActivity> scenarioRule= new ActivityScenarioRule<>(MainActivity.class);
    @Test

    public  void TestCirclebtn(){
        Espresso.onView(withId(R.id.cbtn)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("circle")));
    }
    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testNextButton() {
        // Perform click on next button
        Espresso.onView(withId(R.id.next)).perform(ViewActions.click());

        // Verify that MainActivity2 is launched
        Intents.intended(IntentMatchers.hasComponent(MainActivity2.class.getName()));
    }
}
