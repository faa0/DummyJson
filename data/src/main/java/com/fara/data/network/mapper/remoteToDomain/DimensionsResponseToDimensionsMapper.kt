package com.fara.data.network.mapper.remoteToDomain

import com.fara.data.network.model.response.DimensionsResponse
import com.fara.domain.model.response.Dimensions

internal class DimensionsResponseToDimensionsMapper : (DimensionsResponse) -> Dimensions {

    override fun invoke(dimensionsResponse: DimensionsResponse): Dimensions {
        return Dimensions(
            depth = dimensionsResponse.depth,
            height = dimensionsResponse.height,
            width = dimensionsResponse.width,
        )
    }
}