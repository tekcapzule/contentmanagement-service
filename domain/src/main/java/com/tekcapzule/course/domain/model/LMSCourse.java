package com.tekcapzule.course.domain.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tekcapzule.core.domain.AggregateRoot;
import com.tekcapzule.core.domain.BaseDomainEntity;
import lombok.*;

import java.util.List;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
@DynamoDBTable(tableName = "LMSCourse")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LMSCourse extends BaseDomainEntity implements AggregateRoot {
    @DynamoDBHashKey(attributeName="courseId")
    @DynamoDBAutoGeneratedKey
    private String courseId;
    @DynamoDBAttribute(attributeName = "topicCode")
    private String topicCode;
    @DynamoDBAttribute(attributeName = "title")
    private String title;
    @DynamoDBAttribute(attributeName = "summary")
    private String summary;
    @DynamoDBAttribute(attributeName = "description")
    private String description;
    @DynamoDBAttribute(attributeName = "author")
    private String author;
    @DynamoDBAttribute(attributeName = "publisher")
    private String publisher;
    @DynamoDBAttribute(attributeName = "courseLevel")
    @DynamoDBTypeConvertedEnum
    private CourseLevel courseLevel;
    @DynamoDBAttribute(attributeName = "courseType")
    @DynamoDBTypeConvertedEnum
    private CourseType courseType;
    @DynamoDBAttribute(attributeName = "duration")
    private String duration;
    @DynamoDBAttribute(attributeName = "resourceUrl")
    private String resourceUrl;
    @DynamoDBAttribute(attributeName = "coverImageUrl")
    private String coverImageUrl;
    @DynamoDBAttribute(attributeName = "modules")
    private List<Module> modules;
    @DynamoDBAttribute(attributeName = "prizingModel")
    @DynamoDBTypeConvertedEnum
    private PrizingModel prizingModel;
    @DynamoDBAttribute(attributeName = "deliveryMode")
    @DynamoDBTypeConvertedEnum
    private DeliveryMode deliveryMode;
    @DynamoDBAttribute(attributeName = "learningMode")
    @DynamoDBTypeConvertedEnum
    private LearningMode learningMode;
    @DynamoDBAttribute(attributeName = "promotion")
    private Promotion promotion;
    @DynamoDBAttribute(attributeName = "status")
    @DynamoDBTypeConvertedEnum
    private Status status;
    @DynamoDBAttribute(attributeName = "recommendations")
    private int recommendations;
    @DynamoDBAttribute(attributeName = "courseRating")
    private int courseRating;
    @DynamoDBAttribute(attributeName = "points")
    private int points;
    @DynamoDBAttribute(attributeName = "earnBadge")
    @JsonProperty("earnBadge")
    private boolean earnBadge;
    @DynamoDBAttribute(attributeName = "earnCertification")
    @JsonProperty("earnCertification")
    private boolean earnCertification;
    @DynamoDBAttribute(attributeName = "publishedOn")
    private String publishedOn;
    @DynamoDBAttribute(attributeName = "modules")
    private Quiz quiz;

}

