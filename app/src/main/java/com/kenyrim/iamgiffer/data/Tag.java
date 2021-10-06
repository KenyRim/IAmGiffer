package com.kenyrim.iamgiffer.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {

@SerializedName("val")
@Expose
private Integer val;
@SerializedName("tag")
@Expose
private Tag__1 tag;

public Integer getVal() {
return val;
}

public void setVal(Integer val) {
this.val = val;
}

public Tag withVal(Integer val) {
this.val = val;
return this;
}

public Tag__1 getTag() {
return tag;
}

public void setTag(Tag__1 tag) {
this.tag = tag;
}

public Tag withTag(Tag__1 tag) {
this.tag = tag;
return this;
}

}