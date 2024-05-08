package com.example.demouitesting;

import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.Espresso;
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

    public  void TestCircleName(){
        Espresso.onView(withId(R.id.cId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textName)).check(ViewAssertions.matches(ViewMatchers.withText("circle")));
    }
    @Test

    public  void TestCircleArea(){
        Espresso.onView(withId(R.id.cId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.areaId)).check(ViewAssertions.matches(ViewMatchers.withText("12.56637")));
    }
    @Test

    public  void TestCirclePeri(){
        Espresso.onView(withId(R.id.cId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.perimeterId)).check(ViewAssertions.matches(ViewMatchers.withText("12.56637")));
    }
    @Test

    public  void TestSquareName(){
        Espresso.onView(withId(R.id.sId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textName)).check(ViewAssertions.matches(ViewMatchers.withText("square")));
    }
    @Test

    public  void TestSquareArea(){
        Espresso.onView(withId(R.id.sId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.areaId)).check(ViewAssertions.matches(ViewMatchers.withText("4")));
    }
    @Test

    public  void TestSquarePeri(){
        Espresso.onView(withId(R.id.sId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.perimeterId)).check(ViewAssertions.matches(ViewMatchers.withText("8")));
    }

    @Test

    public  void TestTriName(){
        Espresso.onView(withId(R.id.tId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textName)).check(ViewAssertions.matches(ViewMatchers.withText("triangle")));
    }
    @Test

    public  void TestTriArea(){
        Espresso.onView(withId(R.id.tId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.areaId)).check(ViewAssertions.matches(ViewMatchers.withText("6")));
    }
    @Test

    public  void TestTriPeri(){
        Espresso.onView(withId(R.id.tId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.perimeterId)).check(ViewAssertions.matches(ViewMatchers.withText("12")));
    }

    @Test

    public void redName(){
        Espresso.onView(withId(R.id.redIId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textName)).check(ViewAssertions.matches(ViewMatchers.withText("red")));
    }

    @Test

    public void blueName(){
        Espresso.onView(withId(R.id.blueId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textName)).check(ViewAssertions.matches(ViewMatchers.withText("blue")));
    }

    @Test

    public void greenName(){
        Espresso.onView(withId(R.id.greenId)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.textName)).check(ViewAssertions.matches(ViewMatchers.withText("green")));
    }
}





