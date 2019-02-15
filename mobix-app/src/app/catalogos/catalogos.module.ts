import { NgModule } from '@angular/core';

import { SharedModule } from '../_shared/shared.module';
import { ReportesModule } from '../reportes/reportes.module';
import { CatalogosRoutingModule } from './catalogos-routing.module';

import { StoreModule } from '@ngrx/store';
import { EffectsModule } from '@ngrx/effects';

import { reducers, effects } from './store';

import { components, entryComponents } from './components';
import { containers } from './containers';
import { services } from './services';
import { guards } from './guards';

@NgModule({
  imports: [
    SharedModule,
    CatalogosRoutingModule,
    ReportesModule,
    StoreModule.forFeature('catalogos', reducers),
    EffectsModule.forFeature(effects)
  ],
  declarations: [...components, ...containers],
  entryComponents: [...entryComponents],
  providers: [...services, ...guards]
})
export class CatalogosModule {}
