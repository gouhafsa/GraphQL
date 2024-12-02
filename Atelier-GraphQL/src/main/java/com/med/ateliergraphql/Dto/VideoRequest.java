package com.med.ateliergraphql.Dto;

import lombok.Data;

@Data
public class VideoRequest {
    private String name;
    private String url;
    private String description;
    private String datePublication;
    private CreatorRequest creator;
}
