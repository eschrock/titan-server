/*
 * Copyright (c) 2019 by Delphix. All rights reserved.
 */

package com.delphix.titan.models

data class S3Remote(
    override var provider: String = "s3",
    override var name: String,
    var bucket: String,
    var path: String? = null,
    var accessKey: String? = null,
    var secretKey: String? = null,
    var region: String? = null
) : Remote()
