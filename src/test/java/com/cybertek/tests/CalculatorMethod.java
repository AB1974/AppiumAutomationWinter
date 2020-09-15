package com.cybertek.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorMethod {



        private AndroidDriver<MobileElement> driver;
        public CalculatorMethod()
        {

        }

        public CalculatorMethod(AndroidDriver<MobileElement> driver)
        {
            this.driver = driver;
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }
        @FindBy(id = "com.android.calculator2:id/digit_1")
        public AndroidElement digit1;
        @FindBy(id = "com.android.calculator2:id/digit_2")
        public AndroidElement digit2;
        @FindBy(id = "com.android.calculator2:id/digit_3")
        public AndroidElement digit3;
        @FindBy(id = "com.android.calculator2:id/digit_4")
        public AndroidElement digit4;
        @FindBy(id = "com.android.calculator2:id/digit_5")
        public AndroidElement digit5;
        @FindBy(id = "com.android.calculator2:id/digit_6")
        public AndroidElement digit6;
        @FindBy(id = "com.android.calculator2:id/digit_7")
        public AndroidElement digit7;
        @FindBy(id = "com.android.calculator2:id/digit_8")
        public AndroidElement digit8;
        @FindBy(id = "com.android.calculator2:id/digit_9")
        public AndroidElement digit9;
        @FindBy(id = "com.android.calculator2:id/digit_0")
        public AndroidElement digit0;
        @FindBy(id = "com.android.calculator2:id/op_add")
        public AndroidElement addFunc;
        @FindBy(id = "com.android.calculator2:id/op_sub")
        public AndroidElement substractionFunc;
        @FindBy(id = "com.android.calculator2:id/op_mul")
        public AndroidElement multiplyFunc;
        @FindBy(id = "com.android.calculator2:id/op_div")
        public AndroidElement divideFunc;
        @FindBy(id = "com.android.calculator2:id/op_del")
        public AndroidElement deleteFunc;
        @FindBy(id = "com.android.calculator2:id/dec_point")
        public AndroidElement decimalPoint;
        @FindBy(id = "com.android.calculator2:id/eq")
        public AndroidElement equals;
        @FindBy(id = "com.android.calculator2:id/result")
        public AndroidElement result;

        public void calculateThis (String calculation)
        {
            String calculationArr [] = calculation.split(" ");
            String operator = calculationArr[1];
            System.out.println(calculationArr[0]);
            System.out.println(calculationArr[1]);
            System.out.println(calculationArr[2]);
            for (int i=0; i<calculationArr[0].length(); i++)
            {
                Integer num = Integer.parseInt(calculationArr[0].charAt(i)+"");
                switch (num) {
                    case 0:
                        digit0.click();
                        break;
                    case 1:
                        digit1.click();
                        break;
                    case 2:
                        digit2.click();
                        break;
                    case 3:
                        digit3.click();
                        break;
                    case 4:
                        digit4.click();
                        break;
                    case 5:
                        digit5.click();
                        break;
                    case 6:
                        digit6.click();
                        break;
                    case 7:
                        digit7.click();
                        break;
                    case 8:
                        digit8.click();
                        break;
                    case 9:
                        digit9.click();
                        break;
                }
            }
            if (operator.equals("+"))
                addFunc.click();
            else if (operator.equals("-"))
                substractionFunc.click();
            else if (operator.equals("/"))
                divideFunc.click();
            else if (operator.equals("*"))
                multiplyFunc.click();
            else
                System.out.println("Please enter a valid operator sign!!");
            for (int i=0; i<calculationArr[2].length(); i++)
            {
                Integer num = Integer.parseInt(calculationArr[2].charAt(i)+"");
                switch (num) {
                    case 0:
                        digit0.click();
                        break;
                    case 1:
                        digit1.click();
                        break;
                    case 2:
                        digit2.click();
                        break;
                    case 3:
                        digit3.click();
                        break;
                    case 4:
                        digit4.click();
                        break;
                    case 5:
                        digit5.click();
                        break;
                    case 6:
                        digit6.click();
                        break;
                    case 7:
                        digit7.click();
                        break;
                    case 8:
                        digit8.click();
                        break;
                    case 9:
                        digit9.click();
                        break;
                }
            }
            equals.click();
        }
    }



