import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Salle } from './salle';

@Injectable({
  providedIn: 'root'
})
export class SalleService {
  private baseURL="http://localhost:8080/Salle/getAllSalle";

  constructor(private http:HttpClient) { }

  public getSallesList():Observable<Salle[]>{
    return this.http.get<Salle[]>(`${this.baseURL}`);
  }
  public CreateSalle(salle:Salle):Observable<any>{
    return this.http.post(`${this.baseURL}`,salle);
  }
  public getsallebyid(id:number):Observable<Salle>{
    return this.http.get<Salle>(`${this.baseURL}/${id}`);
  }
  public updatesalle(id : number ,salle:Salle):Observable<object>{
    return this.http.put(`${this.baseURL}/${id}`,salle);

  }
  public deletesalle(id:number ):Observable<object>{
    return this.http.delete(`${this.baseURL}/${id}`)
  }
}

