package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class HelloWorldFunction implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();

        logger.log("Invoked HelloWorldFunction with argument '" + input + "'\n");

        return "Hello " + input;
    }
}
