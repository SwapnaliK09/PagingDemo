package com.example.pagingdemoandroid;

import java.util.List;

class Owner {
    public int reputation;
    public long user_id;
    public String user_type;
    public String profile_image;
    public String display_name;
    public String link;

    @Override
    public String toString() {
        return "Owner{" +
                "reputation=" + reputation +
                ", user_id=" + user_id +
                ", user_type='" + user_type + '\'' +
                ", profile_image='" + profile_image + '\'' +
                ", display_name='" + display_name + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

class Item {
    public Owner owner;
    public boolean is_accepted;
    public int score;
    public long last_activity_date;
    public long creation_date;
    public long answer_id;
    public long question_id;

    @Override
    public String toString() {
        return "Item{" +
                "owner=" + owner +
                ", is_accepted=" + is_accepted +
                ", score=" + score +
                ", last_activity_date=" + last_activity_date +
                ", creation_date=" + creation_date +
                ", answer_id=" + answer_id +
                ", question_id=" + question_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return question_id == item.question_id;
    }


}

public class StackApiResponse {
    public List<Item> items;
    public boolean has_more;
    public int quota_max;
    public int quota_remaining;

    @Override
    public String toString() {
        return "StackApiResponse{" +
                "items=" + items +
                ", has_more=" + has_more +
                ", quota_max=" + quota_max +
                ", quota_remaining=" + quota_remaining +
                '}';
    }
}