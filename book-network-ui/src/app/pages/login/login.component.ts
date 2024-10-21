import { Component } from '@angular/core';
import { AuthenticationRequest } from '../../services/models/authentication-request';
import { Router } from '@angular/router';
import { AuthenticationService } from '../../services/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'] // Corrected styleUrl to styleUrls
})
export class LoginComponent {
  authRequest: AuthenticationRequest = { email: '', password: '' };
  errorMsg: Array<string> = [];

  constructor(
    private router: Router,
    private authService: AuthenticationService
  ) {}

  login() {
    this.errorMsg = [];
    this.authService.authenticate({
      body: this.authRequest
    }).subscribe({
      next: (res) => {
        // Save the token and navigate to the 'books' page
        this.router.navigate(['books']);
      },
      error: (err) => {
        console.log(err);
        this.errorMsg.push('Authentication failed. Please try again.'); // Add an error message
      }
    });
  }

  register() {
    this.router.navigate(['register']);
  }
}
