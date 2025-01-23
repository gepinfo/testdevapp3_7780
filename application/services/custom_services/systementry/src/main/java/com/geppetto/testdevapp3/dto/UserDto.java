package com.geppetto.testdevapp3.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Builder;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotBlank(message = "id cannot be null or empty")
    private String id;
     
    @NotBlank(message = "firstname cannot be null or empty")  
    private String firstname;
   
    @NotBlank(message = "lastname cannot be null or empty")  
    private String lastname;
   
    @NotBlank(message = "username cannot be null or empty")  
    private String username;
   
    @NotBlank(message = "email cannot be null or empty")  
    private String email;
   
    @NotBlank(message = "password cannot be null or empty")  
    private String password;
   
    @NotBlank(message = "signintype cannot be null or empty")  
    private String signintype;
   
    @NotBlank(message = "fbId cannot be null or empty")  
    private String fbId;
   
    @NotBlank(message = "githubId cannot be null or empty")  
    private String githubId;
   
    @NotBlank(message = "phonenumber cannot be null or empty")  
    private String phonenumber;
   
    @NotBlank(message = "avatar cannot be null or empty")  
    private String avatar;
   
    @NotBlank(message = "Idtoken cannot be null or empty")  
    private String Idtoken;
   
    {Number=@NotNull, String=@NotBlank}(message = "loggedinDate cannot be null or empty")  
    private Date loggedinDate;
   
    {Number=@NotNull, String=@NotBlank}(message = "loggedoutDate cannot be null or empty")  
    private Date loggedoutDate;
   
    {Number=@NotNull, String=@NotBlank}(message = "role cannot be null or empty")  
    private { type: mongoose.Schema.Types.String, ref: &#x27;roles&#x27; } role;
   
    @NotBlank(message = "org cannot be null or empty")  
    private String org;
   
    @NotBlank(message = "org_country cannot be null or empty")  
    private String org_country;
   
    @NotBlank(message = "org_sub1 cannot be null or empty")  
    private String org_sub1;
   
    @NotBlank(message = "org_sub2 cannot be null or empty")  
    private String org_sub2;
   
    @NotBlank(message = "org_sub3 cannot be null or empty")  
    private String org_sub3;
  
    }
