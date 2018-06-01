package me.country.hello;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.Duration;
import java.util.List;

public class CountryProperties {

    @NotEmpty
    private String name;

    private List<MyPojo> list;

    private String workFor;

    private String whereToGo;

    private String fooBar;

    private Duration time1; // 10ms

    private Duration time2; // 10h

    private Duration time3; // 10s

    @Min(0)
    @Max(100)
    private int number;

    private int number2;

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Duration getTime2() {
        return time2;
    }

    public void setTime2(Duration time2) {
        this.time2 = time2;
    }

    public Duration getTime3() {
        return time3;
    }

    public void setTime3(Duration time3) {
        this.time3 = time3;
    }

    public Duration getTime1() {
        return time1;
    }

    public void setTime1(Duration time1) {
        this.time1 = time1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyPojo> getList() {
        return list;
    }

    public void setList(List<MyPojo> list) {
        this.list = list;
    }

    public String getWorkFor() {
        return workFor;
    }

    public void setWorkFor(String workFor) {
        this.workFor = workFor;
    }

    public String getWhereToGo() {
        return whereToGo;
    }

    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo;
    }

    public String getFooBar() {
        return fooBar;
    }

    public void setFooBar(String fooBar) {
        this.fooBar = fooBar;
    }
}
