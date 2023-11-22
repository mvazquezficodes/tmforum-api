package org.fiware.resourcecatalog.model;

import org.fiware.resourcecatalog.model.LogicalResourceSpecificationVO.*;

public class LogicalResourceSpecificationVOTestExample {

	public static LogicalResourceSpecificationVO build() {
		LogicalResourceSpecificationVO exampleInstance = new LogicalResourceSpecificationVO();
		//initialize fields
		exampleInstance.setId("string");
		exampleInstance.setHref(java.net.URI.create("my:uri"));
		exampleInstance.setCategory("string");
		exampleInstance.setDescription("string");
		exampleInstance.setIsBundle(false);
		exampleInstance.setLastUpdate(null);
		exampleInstance.setLifecycleStatus("string");
		exampleInstance.setName("string");
		exampleInstance.setVersion("string");
		exampleInstance.setAttachment(java.util.List.of());
		exampleInstance.setFeatureSpecification(java.util.List.of());
		exampleInstance.setRelatedParty(java.util.List.of());
		exampleInstance.setResourceSpecCharacteristic(java.util.List.of());
		exampleInstance.setResourceSpecRelationship(java.util.List.of());
		exampleInstance.setTargetResourceSchema(null);
		exampleInstance.setTargetResourceSchema(TargetResourceSchemaVOTestExample.build());
		exampleInstance.setValidFor(null);
		exampleInstance.setValidFor(TimePeriodVOTestExample.build());
		exampleInstance.setAtBaseType("string");
		exampleInstance.setAtSchemaLocation(java.net.URI.create("my:uri"));
		exampleInstance.setAtType("string");
		return exampleInstance;
	}
}
