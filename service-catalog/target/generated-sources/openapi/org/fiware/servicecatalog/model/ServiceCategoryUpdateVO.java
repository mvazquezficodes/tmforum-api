package org.fiware.servicecatalog.model;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ServiceCategoryUpdateVO {

	public static final java.lang.String JSON_PROPERTY_DESCRIPTION = "description";
	public static final java.lang.String JSON_PROPERTY_IS_ROOT = "isRoot";
	public static final java.lang.String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
	public static final java.lang.String JSON_PROPERTY_NAME = "name";
	public static final java.lang.String JSON_PROPERTY_PARENT_ID = "parentId";
	public static final java.lang.String JSON_PROPERTY_VERSION = "version";
	public static final java.lang.String JSON_PROPERTY_CATEGORY = "category";
	public static final java.lang.String JSON_PROPERTY_SERVICE_CANDIDATE = "serviceCandidate";
	public static final java.lang.String JSON_PROPERTY_VALID_FOR = "validFor";
	public static final java.lang.String JSON_PROPERTY_AT_BASE_TYPE = "@baseType";
	public static final java.lang.String JSON_PROPERTY_AT_SCHEMA_LOCATION = "@schemaLocation";
	public static final java.lang.String JSON_PROPERTY_AT_TYPE = "@type";

	/** Description of the category */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DESCRIPTION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String description;

	/** If true, this Boolean indicates that the category is a root of categories */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_IS_ROOT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Boolean isRoot;

	/** Used to indicate the current lifecycle status */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String lifecycleStatus;

	/** Name of the category */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String name;

	/** Unique identifier of the parent category */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_PARENT_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String parentId;

	/** ServiceCategory version */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_VERSION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String version;

	/** List of child categories in the tree for in this category */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CATEGORY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<ServiceCategoryRefVO> category;

	/** List of service candidates associated with this category */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SERVICE_CANDIDATE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<ServiceCandidateRefVO> serviceCandidate;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_VALID_FOR)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private TimePeriodVO validFor;

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

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ServiceCategoryUpdateVO other = (ServiceCategoryUpdateVO) object;
		return java.util.Objects.equals(description, other.description)
				&& java.util.Objects.equals(isRoot, other.isRoot)
				&& java.util.Objects.equals(lifecycleStatus, other.lifecycleStatus)
				&& java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(parentId, other.parentId)
				&& java.util.Objects.equals(version, other.version)
				&& java.util.Objects.equals(category, other.category)
				&& java.util.Objects.equals(serviceCandidate, other.serviceCandidate)
				&& java.util.Objects.equals(validFor, other.validFor)
				&& java.util.Objects.equals(atBaseType, other.atBaseType)
				&& java.util.Objects.equals(atSchemaLocation, other.atSchemaLocation)
				&& java.util.Objects.equals(atType, other.atType);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(description, isRoot, lifecycleStatus, name, parentId, version, category, serviceCandidate, validFor, atBaseType, atSchemaLocation, atType);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ServiceCategoryUpdateVO[")
				.append("description=").append(description).append(",")
				.append("isRoot=").append(isRoot).append(",")
				.append("lifecycleStatus=").append(lifecycleStatus).append(",")
				.append("name=").append(name).append(",")
				.append("parentId=").append(parentId).append(",")
				.append("version=").append(version).append(",")
				.append("category=").append(category).append(",")
				.append("serviceCandidate=").append(serviceCandidate).append(",")
				.append("validFor=").append(validFor).append(",")
				.append("atBaseType=").append(atBaseType).append(",")
				.append("atSchemaLocation=").append(atSchemaLocation).append(",")
				.append("atType=").append(atType)
				.append("]")
				.toString();
	}

	// fluent

	public ServiceCategoryUpdateVO description(java.lang.String newDescription) {
		this.description = newDescription;
		return this;
	}

	public ServiceCategoryUpdateVO isRoot(java.lang.Boolean newIsRoot) {
		this.isRoot = newIsRoot;
		return this;
	}

	public ServiceCategoryUpdateVO lifecycleStatus(java.lang.String newLifecycleStatus) {
		this.lifecycleStatus = newLifecycleStatus;
		return this;
	}

	public ServiceCategoryUpdateVO name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public ServiceCategoryUpdateVO parentId(java.lang.String newParentId) {
		this.parentId = newParentId;
		return this;
	}

	public ServiceCategoryUpdateVO version(java.lang.String newVersion) {
		this.version = newVersion;
		return this;
	}

	public ServiceCategoryUpdateVO category(java.util.List<ServiceCategoryRefVO> newCategory) {
		this.category = newCategory;
		return this;
	}
	
	public ServiceCategoryUpdateVO addCategoryItem(ServiceCategoryRefVO categoryItem) {
		if (this.category == null) {
			this.category = new java.util.ArrayList<>();
		}
		this.category.add(categoryItem);
		return this;
	}

	public ServiceCategoryUpdateVO removeCategoryItem(ServiceCategoryRefVO categoryItem) {
		if (this.category != null) {
			this.category.remove(categoryItem);
		}
		return this;
	}

	public ServiceCategoryUpdateVO serviceCandidate(java.util.List<ServiceCandidateRefVO> newServiceCandidate) {
		this.serviceCandidate = newServiceCandidate;
		return this;
	}
	
	public ServiceCategoryUpdateVO addServiceCandidateItem(ServiceCandidateRefVO serviceCandidateItem) {
		if (this.serviceCandidate == null) {
			this.serviceCandidate = new java.util.ArrayList<>();
		}
		this.serviceCandidate.add(serviceCandidateItem);
		return this;
	}

	public ServiceCategoryUpdateVO removeServiceCandidateItem(ServiceCandidateRefVO serviceCandidateItem) {
		if (this.serviceCandidate != null) {
			this.serviceCandidate.remove(serviceCandidateItem);
		}
		return this;
	}

	public ServiceCategoryUpdateVO validFor(TimePeriodVO newValidFor) {
		this.validFor = newValidFor;
		return this;
	}

	public ServiceCategoryUpdateVO atBaseType(java.lang.String newAtBaseType) {
		this.atBaseType = newAtBaseType;
		return this;
	}

	public ServiceCategoryUpdateVO atSchemaLocation(java.net.URI newAtSchemaLocation) {
		this.atSchemaLocation = newAtSchemaLocation;
		return this;
	}

	public ServiceCategoryUpdateVO atType(java.lang.String newAtType) {
		this.atType = newAtType;
		return this;
	}

	// getter/setter

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String newDescription) {
		this.description = newDescription;
	}

	public java.lang.Boolean getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(java.lang.Boolean newIsRoot) {
		this.isRoot = newIsRoot;
	}

	public java.lang.String getLifecycleStatus() {
		return lifecycleStatus;
	}

	public void setLifecycleStatus(java.lang.String newLifecycleStatus) {
		this.lifecycleStatus = newLifecycleStatus;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String newName) {
		this.name = newName;
	}

	public java.lang.String getParentId() {
		return parentId;
	}

	public void setParentId(java.lang.String newParentId) {
		this.parentId = newParentId;
	}

	public java.lang.String getVersion() {
		return version;
	}

	public void setVersion(java.lang.String newVersion) {
		this.version = newVersion;
	}

	public java.util.List<ServiceCategoryRefVO> getCategory() {
		return category;
	}

	public void setCategory(java.util.List<ServiceCategoryRefVO> newCategory) {
		this.category = newCategory;
	}

	public java.util.List<ServiceCandidateRefVO> getServiceCandidate() {
		return serviceCandidate;
	}

	public void setServiceCandidate(java.util.List<ServiceCandidateRefVO> newServiceCandidate) {
		this.serviceCandidate = newServiceCandidate;
	}

	public TimePeriodVO getValidFor() {
		return validFor;
	}

	public void setValidFor(TimePeriodVO newValidFor) {
		this.validFor = newValidFor;
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
}
