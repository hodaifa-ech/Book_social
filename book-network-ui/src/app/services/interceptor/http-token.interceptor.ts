import {Injectable} from '@angular/core';
import {HttpEvent, HttpHandler, HttpHeaders, HttpInterceptor, HttpRequest} from '@angular/common/http';
import {Observable} from 'rxjs';
import {TokenService} from '../token/token.service';
@Injectable()
export class HttpTokenInterceptor implements HttpInterceptor {

  constructor(
    private tokeService: TokenService
  ) {
  }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const token = this.tokeService.token;
    if(token){
        const authReq=request.clone({
          headers:new HttpHeaders({
            Authorization: 'Bearer'+token
          })
        });
        return next.handle(authReq);
    }
    return next.handle(request);
  }


}
