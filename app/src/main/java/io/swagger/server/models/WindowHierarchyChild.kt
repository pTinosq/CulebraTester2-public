/**
* CulebraTester
* ## Snaky Android Test --- If you want to be able to try out the API using the **Execute** or **TRY** button from this page - an android device should be connected using `adb` - the server should have been started using `./culebratester2 start-server`  then you will be able to invoke the API and see the responses. 
*
* OpenAPI spec version: 2.0.70
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.models

import io.swagger.server.models.WindowHierarchyChild

/**
 * 
 * @param id 
 * @param parent 
 * @param text 
 * @param &#x60;package&#x60; 
 * @param checkable 
 * @param clickable 
 * @param index 
 * @param contentDescription 
 * @param focusable 
 * @param resourceId 
 * @param enabled 
 * @param password 
 * @param longClickable 
 * @param longText 
 * @param clazz 
 * @param scrollable 
 * @param selected 
 * @param checked 
 * @param focused 
 * @param bounds 
 * @param children 
 */
data class WindowHierarchyChild (

    val id: kotlin.Int? = null,
    val parent: kotlin.Int? = null,
    val text: kotlin.String? = null,
    val `package`: kotlin.String? = null,
    val checkable: kotlin.Boolean? = null,
    val clickable: kotlin.Boolean? = null,
    val index: kotlin.Int? = null,
    val contentDescription: kotlin.String? = null,
    val focusable: kotlin.Boolean? = null,
    val resourceId: kotlin.String? = null,
    val enabled: kotlin.Boolean? = null,
    val password: kotlin.Boolean? = null,
    val longClickable: kotlin.Boolean? = null,
    val longText: kotlin.String? = null,
    val clazz: kotlin.String? = null,
    val scrollable: kotlin.Boolean? = null,
    val selected: kotlin.Boolean? = null,
    val checked: kotlin.Boolean? = null,
    val focused: kotlin.Boolean? = null,
    val bounds: kotlin.Array<kotlin.Int>? = null,
    val children: kotlin.Array<WindowHierarchyChild>? = null
) {
}
