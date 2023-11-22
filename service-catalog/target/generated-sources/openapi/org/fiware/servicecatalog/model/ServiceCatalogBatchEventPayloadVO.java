package org.fiware.servicecatalog.model;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ServiceCatalogBatchEventPayloadVO {

	public static final java.lang.String JSON_PROPERTY_SERVICE_CATALOG = "serviceCatalog";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SERVICE_CATALOG)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private ServiceCatalogVO serviceCatalog;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ServiceCatalogBatchEventPayloadVO other = (ServiceCatalogBatchEventPayloadVO) object;
		return java.util.Objects.equals(serviceCatalog, other.serviceCatalog);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(serviceCatalog);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ServiceCatalogBatchEventPayloadVO[")
				.append("serviceCatalog=").append(serviceCatalog)
				.append("]")
				.toString();
	}

	// fluent

	public ServiceCatalogBatchEventPayloadVO serviceCatalog(ServiceCatalogVO newServiceCatalog) {
		this.serviceCatalog = newServiceCatalog;
		return this;
	}

	// getter/setter

	public ServiceCatalogVO getServiceCatalog() {
		return serviceCatalog;
	}

	public void setServiceCatalog(ServiceCatalogVO newServiceCatalog) {
		this.serviceCatalog = newServiceCatalog;
	}
}
