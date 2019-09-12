/*
 * Copyright (c) 2019 by Delphix. All rights reserved.
 */

package com.delphix.titan.remote.engine

import com.delphix.titan.ProviderModule
import io.kotlintest.TestCase
import io.kotlintest.TestCaseOrder
import io.kotlintest.TestResult
import io.kotlintest.specs.StringSpec
import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.OverrideMockKs

class EngineRemoteProviderTest : StringSpec() {

    @InjectMockKs
    @OverrideMockKs
    var providers = ProviderModule("test")

    @InjectMockKs
    @OverrideMockKs
    lateinit var provider: EngineRemoteProvider

    override fun beforeTest(testCase: TestCase) {
        provider = EngineRemoteProvider(providers)
        return MockKAnnotations.init(this)
    }

    override fun afterTest(testCase: TestCase, result: TestResult) {
        clearAllMocks()
    }

    override fun testCaseOrder() = TestCaseOrder.Random

    init {
    }
}
