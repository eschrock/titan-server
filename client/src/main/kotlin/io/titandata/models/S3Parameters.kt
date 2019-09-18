/*
 * Copyright (c) 2019 by Delphix. All rights reserved.
 */

package io.titandata.models

data class S3Parameters(
    override var provider: String = "s3",
    var accessKey: String? = null,
    var secretKey: String? = null,
    var region: String? = null
) : RemoteParameters()