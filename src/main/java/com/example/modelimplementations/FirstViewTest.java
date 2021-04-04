package com.example.modelimplementations;

import org.graalvm.polyglot.Value;
import org.graphwalker.core.machine.ExecutionContext;

import com.example.FirstView;

public class FirstViewTest extends ExecutionContext implements FirstView {

    @Override
    public void v_FirstView() {
    }

    @Override
    public void e_LeaveFirstViewSubNode() {
    }

    @Override
    public void v_SecondView() {
    }

    @Override
    public void e_EnterFirstViewSubNode() {
    }

    @Override
    public void v_FirstViewSubNode() {
    }

    @Override
    public void e_EnterSecondView() {
        System.out.println("FirstViewTest: Setting global.testAttribute");
        setAttribute("global.testAttribute", Value.asValue("Test_value"));
        System.out.println("FirstViewTest: global.testAttribute = " + getAttribute("global.testAttribute"));
    }
}
