package io.quarkus.qe.kafka.resources;

import io.quarkus.qe.kafka.resources.ConfluentKafkaResource;
import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Collections;
import java.util.List;

public class ConfluentTestProfile implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "confluent";
    }

    @Override
    public List<TestResourceEntry> testResources() {
        return Collections.singletonList(new TestResourceEntry(ConfluentKafkaResource.class));
    }
}
