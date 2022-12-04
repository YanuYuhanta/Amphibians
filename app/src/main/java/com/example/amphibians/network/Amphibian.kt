/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.amphibians.network

/**
 * class Amphibian mendefinisikan data Amphibi dengan menyertakan nama dan deskripsinya
 * properti pada class digunakan moshi untuk mencocokan nama nilai di JSON
 */
 //TODO 7: Data
data class Amphibian(
    val name: String,
    val type: String,
    val description: String
)
