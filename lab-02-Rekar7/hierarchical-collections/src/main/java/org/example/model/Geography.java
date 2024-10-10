package org.example.model;


import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.List;

public class Geography implements IHaveHierarchicalStructure<Geography> {
    private int id;
    private String type;
    private String name;
    private String code;
    private Integer parentId;

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metody z interfejsu
     */

    @Override
    public void setParent(Geography geography) {

    }

    @Override
    public List getChildren() {
        return List.of();
    }

    @Override
    public Geography getParent() {
        return null;
    }

    /**
     * Zwykłe metody
     */

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
