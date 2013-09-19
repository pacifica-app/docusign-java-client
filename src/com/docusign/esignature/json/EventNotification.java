
package com.docusign.esignature.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "EnvelopeEvents",
    "url"
})
public class EventNotification {

    @JsonProperty("EnvelopeEvents")
    private List<EnvelopeEvent> EnvelopeEvents = new ArrayList<EnvelopeEvent>();
    @JsonProperty("url")
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EnvelopeEvents")
    public List<EnvelopeEvent> getEnvelopeEvents() {
        return EnvelopeEvents;
    }

    @JsonProperty("EnvelopeEvents")
    public void setEnvelopeEvents(List<EnvelopeEvent> EnvelopeEvents) {
        this.EnvelopeEvents = EnvelopeEvents;
    }

    public EventNotification withEnvelopeEvents(List<EnvelopeEvent> EnvelopeEvents) {
        this.EnvelopeEvents = EnvelopeEvents;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public EventNotification withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}