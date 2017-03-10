package com.bvb;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class App
{
    public static void main(String args[])
    {
        System.out.println("Doing nothing with the args: " +
            Arrays.stream(args)
                  .collect(Collectors.joining(",")));
    }
}
