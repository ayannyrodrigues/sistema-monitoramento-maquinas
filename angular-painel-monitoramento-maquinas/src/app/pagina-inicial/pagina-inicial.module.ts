import { CommonModule } from '@angular/common';

import { NgModule } from '@angular/core';

import { MaquinaLinhaDeProducaoComponent } from 'src/app/maquina/components/maquina-linha-de-producao/maquina-linha-de-producao.component';
import { SensorMaquinaComponent } from 'src/app/sensor/components/sensor-maquina/sensor-maquina.component';
import { PaginaInicialRoutingModule } from './pagina-inicial-routing.module';
import { PaginaInicialComponent } from './pagina-inicial.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    MaquinaLinhaDeProducaoComponent,
    SensorMaquinaComponent,
    PaginaInicialComponent
  ],
  imports: [
    CommonModule,
    PaginaInicialRoutingModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule
  ]
})
export class PaginaInicialModule { }
