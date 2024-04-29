import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SensorModel } from '../model/sensor-model';
import { interval, mergeMap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SensorService {

  private readonly API = 'http://localhost:8080/api/valores-sensores';

  constructor(private httpCliente: HttpClient) { }

  obterSensores() {
    return interval(5000).pipe(
      mergeMap(() => this.httpCliente.get<SensorModel[]>(this.API))
    )
  }
}
