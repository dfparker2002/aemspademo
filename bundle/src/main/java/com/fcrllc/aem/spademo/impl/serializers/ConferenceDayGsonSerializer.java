package com.fcrllc.aem.spademo.impl.serializers;

import java.lang.reflect.Type;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.fcrllc.aem.spademo.impl.domain.ConferenceDay;
import com.fcrllc.aem.spademo.impl.domain.Slot;

/**
 * {@link JsonSerializer} for a {@link ConferenceDay}.
 * 
 * @author David Parker (dfparker@gmail.com)
 * @author bojana.popovska
 */
public class ConferenceDayGsonSerializer implements JsonSerializer<ConferenceDay> {

  @Override
  public JsonElement serialize(ConferenceDay conferenceDay, Type typeOfSrc, JsonSerializationContext context) {
    JsonObject conferenceDayJson = new JsonObject();
    JsonObject schedule = new JsonObject();
    JsonArray entries = new JsonArray();
    for (Slot slot : conferenceDay.getSlots()) {
      entries.add(context.serialize(slot));
    }

    schedule.add("talks", entries);
    schedule.addProperty("date", formatDate(conferenceDay.getDate()));
    conferenceDayJson.add("schedule", schedule);
    conferenceDayJson.add("sortingInfo", context.serialize(conferenceDay.getSortingInfo()));
    conferenceDayJson.add("pagingInfo", context.serialize(conferenceDay.getPagingInfo()));

    return conferenceDayJson;
  }

  private String formatDate(LocalDate date) {
    DateTimeFormatter formatter = DateTimeFormat.forPattern("MMM-dd-yyyy");
    return formatter.print(date);
  }

}
