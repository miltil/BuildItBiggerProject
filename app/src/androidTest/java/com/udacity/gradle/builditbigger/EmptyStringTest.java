package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

public class EmptyStringTest extends AndroidTestCase {
    public void testVerifyNotEmptyString() throws Exception{
        String joke = "";
        EndpointsAsyncTask mAsyncTask = new EndpointsAsyncTask();
        mAsyncTask.execute(getContext());
        joke = mAsyncTask.get();
        assertTrue(!joke.equals(""));
    }
}
