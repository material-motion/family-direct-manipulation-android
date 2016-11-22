/*
 * Copyright 2016-present The Material Motion Authors. All Rights Reserved.
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
package com.google.android.material.motion.family.directmanipulation;

import com.google.android.material.motion.runtime.PerformerFeatures.NamedPlanPerforming;
import com.google.android.material.motion.runtime.Plan;
import com.google.android.material.motion.runtime.PlanFeatures.NamedPlan;

/**
 * Base abstract class for all gesture plans.
 */
public abstract class GesturePlan extends Plan implements NamedPlan {

  final GestureRecognizer gestureRecognizer;

  GesturePlan(GestureRecognizer gestureRecognizer) {
    this.gestureRecognizer = gestureRecognizer;
  }

  @Override
  public Class<? extends NamedPlanPerforming> getPerformerClass() {
    return GesturePerformer.class;
  }
}
