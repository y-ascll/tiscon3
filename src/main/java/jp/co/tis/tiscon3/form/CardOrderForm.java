package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "「漢字 姓」は必ず入力してください。")
    @Size(max = 60)
    private String kanjiName;

    @NotBlank(message = "「漢字 名」は必ず入力してください。")
    @Size(max = 60)
    private String kanjiName2;

    @NotBlank(message = "「カナ 姓」は必ず入力してください。")
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName;

    @NotBlank(message = "「カナ 名」は必ず入力してください。")
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName2;

    @NotBlank(message = "「ローマ字 姓」は必ず入力してください。")
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName;

    @NotBlank(message = "「ローマ字 名」は必ず入力してください。")
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName2;


    @NotBlank(message = "「生年月日」は必ず入力してください。")
    @Size(max = 10)
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$", message = "「生年月日」は例に従って正しく入力してください。")
    private String dateOfBirth;

    @NotBlank(message = "「年齢」は必ず入力してください。")
    @Min(value = 18)
    private String age;

    @NotBlank(message = "「性別」は必ず選択してください。")
    @Size(max = 6)
    private String gender;

    @NotBlank(message = "「郵便番号」は必ず入力してください。")
    @Size(max = 8)
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$")
    private String zipCode;

    @NotBlank(message = "「ご住所」は必ず入力してください。")
    @Size(max = 255)
    private String address;

    @NotBlank(message = "「電話番号１」は必ず入力してください。" )
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$|^((070|080|090)-[0-9]{4}-[0-9]{4})?$")
    private String homePhoneNumber;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$")
    private String mobilePhoneNumber;

    @NotBlank(message = "「メールアドレス」は必ず入力してください。" )
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank
    @Size(max = 20)
    private String spouse;

    @NotBlank
    @Size(max = 20)
    private String houseClassification;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank
    @Size(max = 120)
    private String job;

    @NotBlank
    @Size(max = 11)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

}
