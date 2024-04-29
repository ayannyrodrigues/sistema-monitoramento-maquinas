import { SensorService } from './../../services/sensor.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sensor-maquina',
  templateUrl: './sensor-maquina.component.html',
  styleUrls: ['./sensor-maquina.component.scss']
})
export class SensorMaquinaComponent implements OnInit{

  constructor(private sensorService: SensorService) { }

  ngOnInit(): void {
   this.carregarGrafico();
  }

  carregarGrafico() {
    this.sensorService.obterSensores().subscribe(data => console.log("data:", data))
  }
}
