
package com.service.test.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.16
 * Sun May 31 00:42:49 IST 2015
 * Generated source version: 2.7.16
 */

@XmlRootElement(name = "addition", namespace = "http://test.service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addition", namespace = "http://test.service.com/", propOrder = {"arg0", "arg1"})

public class Addition {

    @XmlElement(name = "arg0")
    private int arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}

