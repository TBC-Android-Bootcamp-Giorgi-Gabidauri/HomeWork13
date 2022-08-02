package com.gabo.jsonparse.model.subClasses.internalTransformations

import com.gabo.jsonparse.model.subClasses.internalTransformations.subClasses.DeliveryLocation
import com.gabo.jsonparse.model.subClasses.internalTransformations.subClasses.PickUpLocation

data class InternalTransformations(
    val id: String,
    val projectRequestId: String,
    val pickUpDate: String,
    val deliveryDate: String,
    val description: String?,
    val Status: String,
    val startDateOption: Any?,
    val endDateOption: Any?,
    val pickUpLocation: PickUpLocation,
    val deliveryLocation: DeliveryLocation,
    val provider: String,
    val pickUpLocationAddress: String,
    val deliveryLocationAddress: String,
    val pGroup: String,
    val isOrganizedWithoutSam: Boolean?,
    val templatePGroup: String,
    val pickupDateMilliSeconds: Long,
    val deliveryDateMilliseconds: Long,
    val startDateOptionMilliseconds: Any?,
    val endDateOptionMilliseconds: Any?,

    )