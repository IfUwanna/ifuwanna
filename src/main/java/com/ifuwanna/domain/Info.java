package com.ifuwanna.domain;

import java.util.List;

/**
 * packageName    : com.template.domain
 * fileName       : Info
 * author         : Jihun Park
 * date           : 2022/03/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/18        Jihun Park       최초 생성
 */
public class Info {
    private Name name;
    private List<Address> addrs;

    public Info() {
    }

    public Info(Name name, List<Address> addrs) {
        this.name = name;
        this.addrs = addrs;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Address> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<Address> addrs) {
        this.addrs = addrs;
    }
}
