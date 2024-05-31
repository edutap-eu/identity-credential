/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.identity.documenttype.knowntypes

import com.android.identity.cbor.toDataItem
import com.android.identity.cbor.toDataItemFullDate
import com.android.identity.documenttype.DocumentAttributeType
import com.android.identity.documenttype.DocumentType

/**
 * Object containing the metadata of the EU Personal ID Document Type.
 *
 * Source: https://github.com/eu-digital-identity-wallet/eudi-doc-architecture-and-reference-framework/blob/main/docs/annexes/annex-06-pid-rulebook.md
 */
object EduTAPeduID {
    const val EDUTAP_DOCTYPE = "eu.edutap.eduid.1"
    const val EDUTAP_NAMESPACE = "eu.edutap.eduid.1"

    /**
     * Build the EU Personal ID Document Type.
     */
    fun getDocumentType(): DocumentType {
        return DocumentType.Builder("EduTAP eduID")
            .addMdocDocumentType(EDUTAP_DOCTYPE)
            .addMdocAttribute(
                DocumentAttributeType.String,
                "family_name",
                "Family Name",
                "Current last name(s), surname(s), or primary identifier of the PID holder",
                true,
                EDUTAP_NAMESPACE,
                SampleData.FAMILY_NAME.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "given_name",
                "Given Names",
                "Current first name(s), other name(s), or secondary identifier of the PID holder",
                true,
                EDUTAP_NAMESPACE,
                SampleData.GIVEN_NAME.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "birth_date",
                "Date of Birth",
                "Day, month, and year on which the PID holder was born. If unknown, approximate date of birth.",
                true,
                EDUTAP_NAMESPACE,
                SampleData.birthDate.toDataItemFullDate
            )
            .addMdocAttribute(
                DocumentAttributeType.Number,
                "age_in_years",
                "Age in Years",
                "The age of the PID holder in years",
                false,
                EDUTAP_NAMESPACE,
                SampleData.AGE_IN_YEARS.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.Number,
                "age_birth_year",
                "Year of Birth",
                "The year when the PID holder was born",
                false,
                EDUTAP_NAMESPACE,
                SampleData.AGE_BIRTH_YEAR.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "age_over_18",
                "Older Than 18",
                "Age over 18?",
                false,
                EDUTAP_NAMESPACE,
                SampleData.AGE_OVER_18.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "age_over_21",
                "Older Than 21",
                "Age over 21?",
                false,
                EDUTAP_NAMESPACE,
                SampleData.AGE_OVER_21.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "family_name_birth",
                "Family Name at Birth",
                "Last name(s), surname(s), or primary identifier of the PID holder at birth",
                false,
                EDUTAP_NAMESPACE,
                SampleData.FAMILY_NAME_BIRTH.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "given_name_birth",
                "First Name at Birth",
                "First name(s), other name(s), or secondary identifier of the PID holder at birth",
                false,
                EDUTAP_NAMESPACE,
                SampleData.GIVEN_NAME_BIRTH.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "birth_place",
                "Place of Birth",
                "Country and municipality or state/province where the PID holder was born",
                false,
                EDUTAP_NAMESPACE,
                SampleData.BIRTH_PLACE.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.StringOptions(Options.COUNTRY_ISO_3166_1_ALPHA_2),
                "birth_country",
                "Country of Birth",
                "The country where the PID User was born, as an Alpha-2 country code as specified in ISO 3166-1",
                false,
                EDUTAP_NAMESPACE,
                SampleData.BIRTH_COUNTRY.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "birth_state",
                "State of Birth",
                "The state, province, district, or local area where the PID User was born",
                false,
                EDUTAP_NAMESPACE,
                SampleData.BIRTH_STATE.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "birth_city",
                "City of Birth",
                "The municipality, city, town, or village where the PID User was born",
                false,
                EDUTAP_NAMESPACE,
                SampleData.BIRTH_CITY.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_address",
                "Resident Address",
                "The full address of the place where the PID holder currently resides and/or may be contacted (street/house number, municipality etc.)",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_ADDRESS.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.StringOptions(Options.COUNTRY_ISO_3166_1_ALPHA_2),
                "resident_country",
                "Resident Country",
                "The country where the PID User currently resides, as an Alpha-2 country code as specified in ISO 3166-1",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_COUNTRY.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_state",
                "Resident State",
                "The state, province, district, or local area where the PID User currently resides.",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_STATE.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_city",
                "Resident City",
                "The city where the PID holder currently resides",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_CITY.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_postal_code",
                "Resident Postal Code",
                "The postal code of the place where the PID holder currently resides",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_POSTAL_CODE.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_street",
                "Resident Street",
                "The name of the street where the PID User currently resides.",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_STREET.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_house_number",
                "Resident House Number",
                "The house number where the PID User currently resides, including any affix or suffix",
                false,
                EDUTAP_NAMESPACE,
                SampleData.RESIDENT_HOUSE_NUMBER.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.IntegerOptions(Options.SEX_ISO_IEC_5218),
                "gender",
                "Gender",
                "PID holder’s gender",
                false,
                EDUTAP_NAMESPACE,
                SampleData.SEX_ISO218.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.StringOptions(Options.COUNTRY_ISO_3166_1_ALPHA_2),
                "nationality",
                "Nationality",
                "Alpha-2 country code as specified in ISO 3166-1, representing the nationality of the PID User.",
                true,
                EDUTAP_NAMESPACE,
                SampleData.NATIONALITY.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "issuance_date",
                "Date of Issue",
                "Date (and possibly time) when the PID was issued.",
                true,
                EDUTAP_NAMESPACE,
                SampleData.issueDate.toDataItemFullDate
            )
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "expiry_date",
                "Date of Expiry",
                "Date (and possibly time) when the PID will expire.",
                true,
                EDUTAP_NAMESPACE,
                SampleData.expiryDate.toDataItemFullDate
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "issuing_authority",
                "Issuing Authority",
                "Name of the administrative authority that has issued this edu ID instance, or the " +
                        "ISO 3166 Alpha-2 country code of the respective Member State if there is" +
                        "no separate authority authorized to issue PIDs.",
                true,
                EDUTAP_NAMESPACE,
                SampleData.ISSUING_AUTHORITY_EU_PID.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "document_number",
                "Document Number",
                "A number for the PID, assigned by the PID Provider.",
                false,
                EDUTAP_NAMESPACE,
                SampleData.DOCUMENT_NUMBER.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "administrative_number",
                "Administrative Number",
                "A number assigned by the PID Provider for audit control or other purposes.",
                false,
                EDUTAP_NAMESPACE,
                SampleData.ADMINISTRATIVE_NUMBER.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "issuing_jurisdiction",
                "Issuing Jurisdiction",
                "Country subdivision code of the jurisdiction that issued the PID, as defined in " +
                        "ISO 3166-2:2020, Clause 8. The first part of the code SHALL be the same " +
                        "as the value for issuing_country.",
                false,
                EDUTAP_NAMESPACE,
                SampleData.ISSUING_JURISDICTION.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.StringOptions(Options.COUNTRY_ISO_3166_1_ALPHA_2),
                "issuing_country",
                "Issuing Country",
                "Alpha-2 country code, as defined in ISO 3166-1, of the issuing authority’s " +
                        "country or territory",
                true,
                EDUTAP_NAMESPACE,
                SampleData.ISSUING_COUNTRY.toDataItem
            )
            .addMdocAttribute(
                DocumentAttributeType.StringOptions(Options.COUNTRY_ISO_3166_1_ALPHA_2),
                "eduPersonAffiliation",
                "edu person affiliation",
                "https://wiki.refeds.org/display/STAN/eduPerson+(202208)+v4.4.0",
                true,
                EDUTAP_NAMESPACE,
                SampleData.ISSUING_COUNTRY.toDataItem
            )            .build()
    }
}