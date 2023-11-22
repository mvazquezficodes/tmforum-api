package org.fiware.resourcecatalog.model;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class EndpointSpecificationRefVO {

	public static final java.lang.String JSON_PROPERTY_ID = "id";
	public static final java.lang.String JSON_PROPERTY_HREF = "href";
	public static final java.lang.String JSON_PROPERTY_IS_ROOT = "isRoot";
	public static final java.lang.String JSON_PROPERTY_NAME = "name";
	public static final java.lang.String JSON_PROPERTY_ROLE = "role";
	public static final java.lang.String JSON_PROPERTY_CONNECTION_POINT_SPECIFICATION = "connectionPointSpecification";
	public static final java.lang.String JSON_PROPERTY_AT_BASE_TYPE = "@baseType";
	public static final java.lang.String JSON_PROPERTY_AT_SCHEMA_LOCATION = "@schemaLocation";
	public static final java.lang.String JSON_PROPERTY_AT_TYPE = "@type";
	public static final java.lang.String JSON_PROPERTY_AT_REFERRED_TYPE = "@referredType";

	/** unique identifier */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String id;

	/** Hyperlink reference */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_HREF)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI href;

	/** Directionality: true when endpoint is a source, false when a sink. If true for all endpoints connectivity is bidirectional. Default is true. */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_IS_ROOT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Boolean isRoot = true;

	/** Name of the related entity. */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String name;

	/** Role of the Resource Function. */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ROLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String role;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CONNECTION_POINT_SPECIFICATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private ConnectionPointSpecificationRefVO connectionPointSpecification;

	/** When sub-classing, this defines the super-class */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_BASE_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String atBaseType;

	/** A URI to a JSON-Schema file that defines additional attributes and relationships */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_SCHEMA_LOCATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.net.URI atSchemaLocation;

	/** When sub-classing, this defines the sub-class Extensible name */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String atType;

	/** The actual type of the target instance when needed for disambiguation. */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_AT_REFERRED_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String atReferredType;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EndpointSpecificationRefVO other = (EndpointSpecificationRefVO) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(href, other.href)
				&& java.util.Objects.equals(isRoot, other.isRoot)
				&& java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(role, other.role)
				&& java.util.Objects.equals(connectionPointSpecification, other.connectionPointSpecification)
				&& java.util.Objects.equals(atBaseType, other.atBaseType)
				&& java.util.Objects.equals(atSchemaLocation, other.atSchemaLocation)
				&& java.util.Objects.equals(atType, other.atType)
				&& java.util.Objects.equals(atReferredType, other.atReferredType);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, href, isRoot, name, role, connectionPointSpecification, atBaseType, atSchemaLocation, atType, atReferredType);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("EndpointSpecificationRefVO[")
				.append("id=").append(id).append(",")
				.append("href=").append(href).append(",")
				.append("isRoot=").append(isRoot).append(",")
				.append("name=").append(name).append(",")
				.append("role=").append(role).append(",")
				.append("connectionPointSpecification=").append(connectionPointSpecification).append(",")
				.append("atBaseType=").append(atBaseType).append(",")
				.append("atSchemaLocation=").append(atSchemaLocation).append(",")
				.append("atType=").append(atType).append(",")
				.append("atReferredType=").append(atReferredType)
				.append("]")
				.toString();
	}

	// fluent

	public EndpointSpecificationRefVO id(java.lang.String newId) {
		this.id = newId;
		return this;
	}

	public EndpointSpecificationRefVO href(java.net.URI newHref) {
		this.href = newHref;
		return this;
	}

	public EndpointSpecificationRefVO isRoot(java.lang.Boolean newIsRoot) {
		this.isRoot = newIsRoot;
		return this;
	}

	public EndpointSpecificationRefVO name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public EndpointSpecificationRefVO role(java.lang.String newRole) {
		this.role = newRole;
		return this;
	}

	public EndpointSpecificationRefVO connectionPointSpecification(ConnectionPointSpecificationRefVO newConnectionPointSpecification) {
		this.connectionPointSpecification = newConnectionPointSpecification;
		return this;
	}

	public EndpointSpecificationRefVO atBaseType(java.lang.String newAtBaseType) {
		this.atBaseType = newAtBaseType;
		return this;
	}

	public EndpointSpecificationRefVO atSchemaLocation(java.net.URI newAtSchemaLocation) {
		this.atSchemaLocation = newAtSchemaLocation;
		return this;
	}

	public EndpointSpecificationRefVO atType(java.lang.String newAtType) {
		this.atType = newAtType;
		return this;
	}

	public EndpointSpecificationRefVO atReferredType(java.lang.String newAtReferredType) {
		this.atReferredType = newAtReferredType;
		return this;
	}

	// getter/setter

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String newId) {
		this.id = newId;
	}

	public java.net.URI getHref() {
		return href;
	}

	public void setHref(java.net.URI newHref) {
		this.href = newHref;
	}

	public java.lang.Boolean getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(java.lang.Boolean newIsRoot) {
		this.isRoot = newIsRoot;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String newName) {
		this.name = newName;
	}

	public java.lang.String getRole() {
		return role;
	}

	public void setRole(java.lang.String newRole) {
		this.role = newRole;
	}

	public ConnectionPointSpecificationRefVO getConnectionPointSpecification() {
		return connectionPointSpecification;
	}

	public void setConnectionPointSpecification(ConnectionPointSpecificationRefVO newConnectionPointSpecification) {
		this.connectionPointSpecification = newConnectionPointSpecification;
	}

	public java.lang.String getAtBaseType() {
		return atBaseType;
	}

	public void setAtBaseType(java.lang.String newAtBaseType) {
		this.atBaseType = newAtBaseType;
	}

	public java.net.URI getAtSchemaLocation() {
		return atSchemaLocation;
	}

	public void setAtSchemaLocation(java.net.URI newAtSchemaLocation) {
		this.atSchemaLocation = newAtSchemaLocation;
	}

	public java.lang.String getAtType() {
		return atType;
	}

	public void setAtType(java.lang.String newAtType) {
		this.atType = newAtType;
	}

	public java.lang.String getAtReferredType() {
		return atReferredType;
	}

	public void setAtReferredType(java.lang.String newAtReferredType) {
		this.atReferredType = newAtReferredType;
	}
}
